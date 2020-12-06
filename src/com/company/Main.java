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
        if(bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }

        if((bigCount * 5) + smallCount == goal) {
            System.out.println(true);
            return true;
        } else if((bigCount * 5) + smallCount > goal) {

        }

        return false;
    }
}

/*
If (bigCount * bigWeight) + (smallCount * smallWeight) > = goal
    If (bigCount * bigWeight) % goal = 0
        Return true
 */