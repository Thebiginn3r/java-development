package com.plurasight;

public class MoreArrayPractice {
    public static void main(String[] args) {
        String[] nameList = {
                "Natalie", "Sara", "Steve", "George", "Ian", "Johnny"
        };

        for (int i = 0; i < nameList.length; i++) {
            System.out.print(nameList[i] + " ");
        }
        System.out.println("==================================");
        //You can get the following format by typing: iger
        for (String name : nameList) {
            System.out.println(name);
        }

    }
}
