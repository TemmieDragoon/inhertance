package com.miku.Extender;

public class Mario extends Character {

    public int Points = 0;
    public int Lives = 3;


    public Mario(){

        this.Speed = 25;
        this.name = "Mario";
    }

    public void Jump(){

        System.out.println( name + " is jumping with " + Jump + " height");
    }


}
