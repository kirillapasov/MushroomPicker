package com.company;

public class Mushroom_Test {
    public static void main(String[] args){
        Mushroom flyagaric = new Mushroom("flyagaric", "red");
        String agaricname = flyagaric.getMushroomname();
        String agariccolor = flyagaric.getColor();
        System.out.printf("Name: %s \tcolor: %s ", agaricname, agariccolor);
    }
}