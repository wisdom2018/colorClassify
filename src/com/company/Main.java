package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int[] number = new int[5];
        for (int i = 0; i < number.length; i++) {
            number[i] = sc.nextInt();
        }
        colorSort(number);
    }

    public static void colorSort(int[] color) {
        int n = color.length;
        int ptr = 0;
        for(int i=0;i<n;i++){
            if(color[i] == 0){
                int temp = color[i];
                color[i] = color[ptr];
                color[ptr] = temp;
                ++ptr;
            }
        }
        for(int i=ptr;i<n;++i){
            if(color[i]==1){
                int temp =  color[i];
                color[i] = color[ptr];
                color[ptr] = temp;
                ++ptr;
            }
        }
        for (int i = 0; i < color.length; i++) {
            System.out.println(color[i]);
        }
    }
}

