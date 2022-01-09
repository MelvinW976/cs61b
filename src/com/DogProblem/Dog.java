package com.DogProblem;

public class Dog {
    public int weightInPounds;

    public Dog (int i) {
        weightInPounds = i;
    }

    public void makeNoise(){

        if (weightInPounds < 10){
            System.out.println("yipyyopyyip");
        }
        if (weightInPounds < 30){
            System.out.println("bark!bark!");
        }
        else{
            System.out.println("wooooof!");
        }
    }
    public static Dog maxDog(Dog d1, Dog d2){
        if (d1 .weightInPounds > d2.weightInPounds){
            return d1;
        }
        else {
            return d2;
        }
    }
    public static void main(String[] args) {
        Dog d = new Dog(20);
        d.makeNoise();
    }


}
