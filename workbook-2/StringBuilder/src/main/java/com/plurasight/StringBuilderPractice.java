package com.plurasight;

public class StringBuilderPractice {
    public static void main(String[] args) {
        StringBuilder skills = new StringBuilder();
// make sure stringbuilder is not the same name as the class name or else it will be in a loop
        skills.append("Git, ");
        skills.append("HTML , ");

        String mySkills = skills.toString();
        System.out.println(mySkills);
    }
}
