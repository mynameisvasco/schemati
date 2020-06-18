package com.schemati.compiler.languageUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Scope {
    private String id;
    private String category;
    private Scope parent;
    private List<Scope> children;
    private List<Scopable> scopables; //Variables and Functions

    public Scope(String id, String category) {
        this.id = id;
        this.category = category;
        this.children = new ArrayList<>();
        this.scopables = new ArrayList<>();

        //If scope is global add default functions
        if(category.equals("Global")) {
            this.scopables.addAll(defaultFunctions());
        }
    }

    public Scope(String id, String category, Scope parent) {
        this.id = id;
        this.category = category;
        this.children = new ArrayList<>();
        this.parent = parent;
        this.scopables = new ArrayList<>();
        if(category.equals("Global")) {
            this.scopables.addAll(defaultFunctions());
        }
    }

    public void addChildren(Scope s) {
        this.children.add(s);
    }

    public boolean addScopable(Scopable s) {
        //In for statement scopes work differently, you cannot reassign a variable that exists in parent scopes;
        if(this.category.equals("For") || this.category.equals("If") || this.category.equals("Anim")) {
            if(containsInScopeAndParent(s.getId())) {
                return false;
            }
        }
        if(containsInScope(s)) {
            return false;
        }
        return scopables.add(s);
    }

    public boolean containsInScope(Scopable s) {
        for(Scopable scopable : this.scopables) {
            if(scopable.getId().equals(s.getId())) {
                return true;
            }
        }
        return false;
    }

    public boolean containsInScope(String id) {
        for(Scopable scopable : this.scopables) {
            if(scopable.getId().equals(id)) {
                return true;
            }
        }
        return false;
    }

    public boolean containsInScopeAndParent(String id) {
        Scope tmpScope = this;
        while(tmpScope != null) {
            List<Scopable> scopables = tmpScope.scopables;
            for(Scopable scopable : scopables) {
                if(scopable.getId().equals(id)) {
                    return true;
                }
            }
            tmpScope = tmpScope.parent;
        }
        return false;
    }

    public List<Variable> getVariablesInScope() {
        List<Variable> vars = new ArrayList<>();
        for(Scopable scopable : this.scopables) {
            if(scopable instanceof Variable) {
                vars.add((Variable) scopable);
            }
        }
        return vars;
    }

    public List<Function> getFunctionsInScope() {
        List<Function> funcs = new ArrayList<>();
        for(Scopable scopable : this.scopables) {
            if(scopable instanceof Function) {
                funcs.add((Function) scopable);
            }
        }
        return funcs;
    }


    public Variable getVariable(String id) {
        Scope tmpScope = this;
        while(tmpScope != null) {
            List<Scopable> scopables = tmpScope.scopables;
            for(Scopable scopable : scopables) {
                if(scopable.getId().equals(id)) {
                    return (Variable) scopable;
                }
            }
            tmpScope = tmpScope.parent;
        }
        return null;
    }

    public Function getFunction(String id) {
        for(Function f : getFunctionsInScope()) {
            if(f.getId().equals(id)) {
                return f;
            }
        }

        return null;
    }

    public Scope findScope(String id, Scope scope) {
        for(Scope s : scope.children) {
            if(s.getId().equals(id)) {
                return s;
            }
        }
        return null;
    }


    public String getCategory() {
        return category;
    }

    public boolean isGlobal() {
        return this.category.equalsIgnoreCase("Global");
    }

    public boolean isFunction() {
        return this.category.startsWith("Function");
    }

    public boolean isFor() {
        return this.category.startsWith("For");
    }

    public boolean isIf() {
        return this.category.startsWith("If");
    }

    public boolean isAnim() {
        return this.category.startsWith("Anim");
    }

    public Scope getParent() {
        return parent;
    }

    public Function toFunction() {
        return (Function) getScopables(this.id.split("-")[1]);
    }

    public Scopable getScopables(String id) {
        for(Scopable scopable : this.scopables) {
            if(scopable.getId().equals(id)) {
                return scopable;
            }
        }
        return null;
    }

    public String getId() {
        return id;
    }

    public void setParent(Scope parent) {
        this.parent = parent;
    }

    @Override
    public String toString() {
        return "Scope{" +
                "id='" + id + '\'' +
                ", category='" + category + '\'' +
                ", parent=" + parent +
                ", scopables=" + scopables +
                '}';
    }

    public static List<Function> defaultFunctions() {
        Function square = new Function("square", Type.fromString("Entity"));
        square.addArgument(new Variable(Type.fromString("String"), "label"));
        square.addArgument(new Variable(Type.fromString("Integer"), "width"));
        square.addArgument(new Variable(Type.fromString("Color"), "color"));
        square.addArgument(new Variable(Type.fromString("Vector2"), "position"));

        Function rectangle = new Function("rectangle", Type.fromString("Entity"));
        rectangle.addArgument(new Variable(Type.fromString("String"), "label"));
        rectangle.addArgument(new Variable(Type.fromString("Integer"), "width"));
        rectangle.addArgument(new Variable(Type.fromString("Integer"), "height"));
        rectangle.addArgument(new Variable(Type.fromString("Color"), "color"));
        rectangle.addArgument(new Variable(Type.fromString("Vector2"), "position"));

        Function polygon = new Function("polygon", Type.fromString("Entity"));
        polygon.addArgument(new Variable(Type.fromString("String"), "label"));
        polygon.addArgument(new Variable(Type.fromString("Color"), "color"));
        polygon.addArgument(new Variable(Type.fromString("Vector2"), "position"));
        polygon.addArgument(new Variable(Type.fromString("Vector2[]"), "vertices"));

        Function image = new Function("image", Type.fromString("Entity"));
        image.addArgument(new Variable(Type.fromString("String"), "label"));
        image.addArgument(new Variable(Type.fromString("Vector2"), "position"));
        image.addArgument(new Variable(Type.fromString("String"), "path"));

        Function ellipse = new Function("ellipse", Type.fromString("Entity"));
        ellipse.addArgument(new Variable(Type.fromString("String"), "label"));
        ellipse.addArgument(new Variable(Type.fromString("Integer"), "width"));
        ellipse.addArgument(new Variable(Type.fromString("Integer"), "height"));
        ellipse.addArgument(new Variable(Type.fromString("Color"), "color"));
        ellipse.addArgument(new Variable(Type.fromString("Vector2"), "position"));

        Function circle = new Function("circle", Type.fromString("Entity"));
        circle.addArgument(new Variable(Type.fromString("String"), "label"));
        circle.addArgument(new Variable(Type.fromString("Integer"), "radius"));
        circle.addArgument(new Variable(Type.fromString("Color"), "color"));
        circle.addArgument(new Variable(Type.fromString("Vector2"), "position"));


        Function text = new Function("text", Type.fromString("Entity"));
        text.addArgument(new Variable(Type.fromString("String"), "label"));
        text.addArgument(new Variable(Type.fromString("Integer"), "fontSize"));
        text.addArgument(new Variable(Type.fromString("Color"), "color"));
        text.addArgument(new Variable(Type.fromString("Vector2"), "position"));

        Function rand = new Function("rand", Type.fromString("Integer"));
        rand.addArgument(new Variable(Type.fromString("Integer"), "min"));
        rand.addArgument(new Variable(Type.fromString("Integer"), "max"));

        Function itos = new Function("itos", Type.fromString("String"));
        itos.addArgument(new Variable(Type.fromString("Integer"), "value"));

        return new ArrayList<>(Arrays.asList(square, rectangle, polygon, image, ellipse, circle, text, rand, itos));
    }
}
