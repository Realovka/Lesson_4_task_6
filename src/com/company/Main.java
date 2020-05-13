package com.company;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
	int [] array = new int[4];
        Random random = new Random();

        for (int i=0; i<array.length; i++){
            array[i]=random.nextInt(10);
        }
        System.out.println(Arrays.toString(array));

        boolean a=true;
        for (int i=1; i<array.length; i++){
            if(array[i]>array[i-1]){

            }
            else{
                a=false;
                break;
            }
        }

        if (a){
            System.out.println("Массив является строго возрастающей последовательностью");
        }
        else {
            System.out.println("Массив не является строго возрастающей последовательностью");
        }
    }
}
