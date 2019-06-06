package com.company.lab3.AnimalRescue;

public class Dog {

//    atributele clasei private
        private String breed;
       private int age;
       private float heightM;
       private float weight;
       private String name;

//        Dog(String dogBreed){
//    }
//    comportamentele clasei

    public void  setBreed(String breed){
        this.breed=breed;
    }

    public String getBreed() {
        return breed;
    }
}
