package com.plurasight;

public class Person {
    private String name;
    private int age;
//right click, generate, select both, constructor
    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }
//right click, generate, select both, getter
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
// right click, generate, select both, setter
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    /*  public Person(String nameFromUser, int ageFromUser) {
        this.name = nameFromUser;
        this.age = ageFromUser;*/

    /*public String getName() {
        return this.name;

    }
    public void setName (String name) {
        this.name = name;
    }*/

}
