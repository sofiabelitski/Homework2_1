package com.company.pack;

public class Robot implements RunJumpable {
    int lenght=1000;
    int  height=5;
    String name;
    public Robot(String name,int lenght,int height) {
        this.name = name;
        this.height=height;
        this.lenght=lenght;
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
    @Override
    public void run() {
        System.out.println("Robot run");
    }

    @Override
    public void jump() {
        System.out.println("Robot jump");
    }
}
