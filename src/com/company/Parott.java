package com.company;

public class Parott {


        String name;
        int age;
        String live;
        String color;
        String features; //особенности



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
        public  void setFeatures (String features) {this.features = features;}

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
        public String getFeatures () {return features; }

        public static void behavior() {
            System.out.println("can talk,sing - суйлойт, ырдай алат");}

    public static void behavior1 () {
            System.out.println("can sit, dance - отурат жана бийлей алат");
        }
        public static void behavior2 () {
            System.out.println("fly - учат");
        }
    }

