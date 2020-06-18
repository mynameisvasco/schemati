Entity square1 = square(label: "square1",width: 100,color: #000000,position: {50,50});
Entity rectangle1 = rectangle( label: "rectangle1", width: 50,height: 100,color: #000000, position: {200,50} );
Vector2[] v = [];
v << {300,200},{350,200},{350,100};
Vector2[] v2 = [];
v2 << {100,100},{400,100},{400,200},{200,200},{200,300},{300,300},{300,400},{200,400},{200,500},{400,500},{400,600},{100,600};
Entity polygon2 = polygon( label: "polygon2", color: #000000, position: {800,15}, vertices: v2);
Entity polygon1 = polygon( label: "polygon1", color: #000000, position: {300,150}, vertices: v);
Entity image1 = image( label: "image1", position: {200,200}, path: "test/com/schemati/test/smile.jpg" );
Entity ellipse1 = ellipse( label: "ellipse1", width: 50, height: 30, color: #000000,position: {700,500});
Entity circle1 = circle( label: "circle1", radius: 70, color: #000000, position: {400,450});
Entity text1 = text(label: "text1", color: #000000, fontSize: 20, position:{100, 600});
square1->position->x = rand(min: 1000, max: 400);
Entity[] entityList = [];
entityList << square1,rectangle1,polygon1,image1,ellipse1,circle1,text1,polygon2;
start entityList;