package com.company;

public class Mushroompicker_Test {
    public static void main(String[] args) {
        Mushroompicker sergey = new Mushroompicker("сергей", 1, 18);
        String sergeyname = sergey.getName();
        Integer sergayage = sergey.getAge();
        Integer sergeylvl = sergey.getLevelskill();
        System.out.printf("Name: %s \tAge: %d \tLVL: %d", sergeyname, sergayage, sergeylvl);
        Mushroompicker ilya = new Mushroompicker("Илюха", 9999999, 20);
        String ilyayname = ilya.getName();
        Integer ilyaage = ilya.getAge();
        Integer ilyalvl = ilya.getLevelskill();
        System.out.printf("         Name1: %s \tAge1: %d \tLVL1: %d", ilyayname, ilyaage, ilyalvl);
    }
}