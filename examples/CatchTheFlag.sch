Entity[] entityList = [];
Vector2 initialPosition1 = {100,350};
Vector2 initialPosition2 = {1000,350};
Vector2 targetPosition = {550,350};
Entity player1  = square(label: "player1", width: 100, color: #00966b, position: initialPosition1);
Entity player2  = square(label: "player2", width: 100, color: #FF0000, position: initialPosition2);
Entity target   = ellipse(label: "target", width: 100, height: 100, color: #FFFF00,  position: targetPosition);
Entity pontos1  = text(label: "0" , color: #000000, fontSize: 30, position: {550,100});
Entity pontos2  = text(label: "0" , color: #000000, fontSize: 30, position: {630,100});
Entity pontos = text(label: "-" , color: #000000, fontSize: 30, position: {600,100});
Entity texto = text(label: "Daniel / Eduardo / Francisco / Roberto / Vasco", color: #000000, fontSize: 15, position:{0,750});
Entity temp = text(label: "0", color: #000000, fontSize: 30, position: {100,100});
Integer p1 = 0;
Integer p2 = 0;
Integer tempo = 0;
Integer mili = 0;
Boolean point = false;



entityList << player1,player2,target,pontos1,pontos2,pontos,texto,temp;

function Boolean dist(Entity a ,Entity b){
    Integer c = a->position->x - b->position->x;
    Integer d = a->position->y - b->position->y;
    if(c<0){
        c = c*-1;
    }
    if(d<0){
        d = d*-1;
    }

    if(c <= b->width){
        if (d <= b->height){
            return true;
        }
    }
    return false;
}

function Boolean outOfBoundsLeft(Entity x){
    if(x->position->x < 0){
        return true;
    }
    return false;
}

function Boolean outOfBoundsRight(Entity x){
    if(x->position->x > 1200-x->width){
        return true;
    }
    return false;
}

function Boolean outOfBoundsUp(Entity x){
    if(x->position->y < 0){
        return true;
    }
    return false;
}

function Boolean outOfBoundsDown(Entity x){
    if(x->position->y > 800-x->height){
        return true;
    }
    return false;
}

function Void game(){
    if(dist(a:player1, b: target)){
        point = true;
        target->position->x = rand(min: 0, max: 1000);
        target->position->y = rand(min: 0, max: 600);
        p1++;
        pontos1->label = itos(value:p1);
    }
    if(dist(a:player2, b: target)){
        point = true;
        target->position->x = rand(min: 0, max: 1000);
        target->position->y = rand(min: 0, max: 600);
        p2++;
        pontos2->label = itos(value:p2);
    }
    return null;
}

anim{
    at VK_W {
        if(outOfBoundsUp(x:player1) == false){
            player1->position->y = player1->position->y - 5;
            game();
        }
    }
    at VK_S {
        if(outOfBoundsDown(x:player1) == false){
            player1->position->y = player1->position->y + 5;
            game();
        }
    }
    at VK_A {
        if(outOfBoundsLeft(x:player1) == false){
            player1->position->x = player1->position->x - 5;
            game();
        }
    }
    at VK_D {
        if(outOfBoundsRight(x:player1) == false){
            player1->position->x = player1->position->x + 5;
            game();
        }
    }
    at VK_UP {
        if(outOfBoundsUp(x:player2) == false){
            player2->position->y = player2->position->y - 5;
            game();
        }
    }
    at VK_DOWN {
        if(outOfBoundsDown(x:player2) == false){
            player2->position->y = player2->position->y + 5;
            game();
        }
    }
    at VK_LEFT {
        if(outOfBoundsLeft(x:player2) == false){
            player2->position->x = player2->position->x - 5;
            game();
        }
    }
    at VK_RIGHT {
        if(outOfBoundsRight(x:player2) == false){
            player2->position->x = player2->position->x + 5;
            game();
        }
    }
    at 0 during 3600s{
        if(texto->position->x >= 1200){
            texto->position->x = -300;
        }
        else{
            texto->position->x++;
        }
        mili = mili +10;
        if(mili == 1000){
            mili = 0;
            tempo++;
            temp->label = itos(value:tempo);
        }
        if(point){
            target->color = #FFFFFF;
            point = false;
        }
        else{
            target->color = #ffff00;
        }
    }
}
start entityList;