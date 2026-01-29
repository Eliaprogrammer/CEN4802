package com.example.assignment3;

public class Panda {
    private String name;
    private int age;
    private boolean isSleeping;
    private double weight;

    public Panda(String name, int age, boolean isSleeping, double weight){
        this.name = name;
        this.age = age;
        this.isSleeping = isSleeping;
        this.weight = weight;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public boolean isSleeping(){
        return isSleeping;
    }

    public void SetIsSleeping(boolean isSleeping){
        this.isSleeping = isSleeping;
    }

    public double getWeight(){
        return weight;
    }

    public void setWeight(double weight){
        this.weight = weight;
    }

    public String toString(){
        return "Panda " + this.name + " is " + this.age + " years old, " +
                this.isSleeping + " sleeping and weighs" + this.weight + " pounds.";
    }
}
