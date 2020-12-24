package com.company.pack;

public class Treadmill  implements Obstacleable{
    int lenght;
    public Treadmill(int lenght) {
        this.lenght=lenght;
    }

    public boolean passTheObstacle(RunJumpable obj){
        if(obj.getLenght()>=this.lenght){
           obj.run();
           return true;
        }else{return false;}

    }
}