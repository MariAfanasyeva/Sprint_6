package com.example;

import java.util.List;

public class Lion {

    public boolean hasMane;
    private Predator predator;

    public Lion(String sex, Predator feline) throws Exception {
        this.predator = feline;
        if ("Самец".equals(sex)) {
            hasMane = true;
        } else if ("Самка".equals(sex)) {
            hasMane = false;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - самец или самка");
        }
    }

    //зависимость Feline feline = new Feline();

    public int getKittens() {

        return predator.getKittens();
    }

    public boolean doesHaveMane() {

        return hasMane;
    }

    public List<String> getFood() throws Exception {
        return predator.eatMeat();
    }
}
