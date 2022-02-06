package com.company;

abstract class Cars {
    public Cars(){

    }
    abstract String toppSpeeed();
}
class Porshe extends Cars {
    @Override
    String toppSpeeed() {
        System.out.println(" 300 km/h");
        return null;
    }

    static class Bmw extends Cars {
        @Override
        String toppSpeeed() {
            System.out.println("250 km/H");
            return null;
        }
    }

    static class CarFactory {
        public Cars createCarFactory(String type) {
            if (type.equalsIgnoreCase("Porshe")) {
                return new Porshe();
            }
            if (type.equalsIgnoreCase("Bmw")) {
                return new Bmw();
            }
            return null;


        }

        public class Main {

            public static void main(String[] args) {
                CarFactory carFactory = new CarFactory();

                Cars porshe = carFactory.createCarFactory("Porshe");
                Cars bmw = carFactory.createCarFactory("Bmw");

                bmw.toppSpeeed();
                porshe.toppSpeeed();



                // write your code here
            }


        }

    }

}

