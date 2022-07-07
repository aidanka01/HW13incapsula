package com.company;

public class Dog {

        String name;
        int age;
        String live;
        String color;


        public void setName(String name) {
            this.name = name;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void setLive (String live) {
            this.live = live;
        }

        public void setColor (String color) {
            this.color = color;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public String getLive() {
            return live;
        }

        public String getColor() {
            return color;
        }

        public static void behavior() {
            System.out.println("barks - урот (гав-гав)");
        }
        public static void behavior1 () {
            System.out.println("guards the house - уйду(дом) кайтарат");
        }
        public static void behavior2 () {
            System.out.println("eat bones - соок жейт");
        }
    }



