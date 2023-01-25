package com.example;

public class Injects {
    public static void main(String[] args) throws Exception {
        String [] sex = {
                "Самец",
                "Самка"
        };
        //объявить зависимость
        Predator feline = new Feline();
        Lion lion = new Lion(sex[0], feline);

    }
}
