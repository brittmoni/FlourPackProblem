package com.company;

public class Main {

    public static void main(String[] args) {
        canPack(1, 0,4);
        canPack(1,0,5);
        canPack(0,5,4);
        canPack(2,2,11);
        canPack(-3,2,12);
        canPack(2,1,5);
        canPack(0, 5,6);
        canPack(4,18, 19);
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if((bigCount < 0) || (smallCount < 0) || (goal < 0)) {
            System.out.println(false);
            return false;
        }

        int bigWeight = 5;
        int smallWeight = 1;

        if((bigCount * bigWeight) + (smallCount * smallWeight) >= goal) {
            if(((bigCount > 0) && (smallCount == 0)) && ((bigCount * bigWeight) % goal == 0)) {
                System.out.println(true);
                return true;
            } else if((bigCount == 0) && ((smallCount * smallWeight) >= goal)) {
                System.out.println(true);
                return true;
            } else if(((bigCount > 0) && (smallCount > 0)) && ((bigCount * bigWeight) % goal == 0)) {
                System.out.println(true);
                return true;
            }
        }

        System.out.println(false);
        return false;
    }
}
