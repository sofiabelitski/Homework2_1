package com.company.pack;

import com.company.pack.Cat;
import com.company.pack.Human;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Cat cat=new Cat("cat",50,2);
        Human human=new Human("human",100,1);
        Robot robot=new Robot("robot",1000,4);
        RunJumpable[] participants=new RunJumpable[]{cat, human,robot};
Wall wall=new Wall(2);
Treadmill tm=new Treadmill(100);
Obstacleable[] obstacles=new Obstacleable[]{wall,tm};

        for (RunJumpable rj: participants
             ) {
            for (Obstacleable ob: obstacles) {

              if(ob.passTheObstacle(rj)) continue;
              else break;

            }


        }

    }
}
