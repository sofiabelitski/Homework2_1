package com.company.pack;

public class Wall  implements Obstacleable{
    int height;
    public Wall(int height) {
        this.height=height;
    }

    public boolean passTheObstacle(RunJumpable obj){
if(obj.getHeight()>=this.height){
    obj.jump();
    return true;
}else{return false;}

    }
}
