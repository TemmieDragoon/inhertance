package com.miku.Extender;

public class Character {

    public int Speed = 4;
    public int Jump = 2;
    public int Health = 3;
    public String name = "Default";

    public void walk(){

        System.out.println( this.name + " Is walking with " + Speed + " Speed." );

    }

}
