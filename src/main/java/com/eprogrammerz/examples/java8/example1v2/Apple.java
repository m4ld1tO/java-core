package com.eprogrammerz.examples.java8.example1v2;

/**
 * Created by 542596 on 11/11/2016.
 */
public class Apple {
    private String color;
    private int weight;

    public Apple(String color, int weight) {
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString(){
        return "("+color+", "+weight+")";
    }
}
