package com.company.pack;

public class Human implements RunJumpable{
   int lenght;
  int  height;
  String name;

    public Human(String name,int lenght,int height) {
        this.name = name;
        this.height=height;
        this.lenght=lenght;
    }

    @Override
    public void run() {
        System.out.println("Human run");
    }

    @Override
    public void jump() {
        System.out.println("Human jump");
    }
    public int getHeight() {
        return height;
    }

    @Override
    public String getName() {
        return name;
    }

    public int getLenght() {
        return lenght;
    }

}
