package org.example;

import java.util.Random;
import java.util.Arrays;

public class RandomArray {
        int[] arr= {1,2,3,4,5};

        public RandomArray(){

        }
        Random random = new Random();
        public void eraseArray() {
            while (arr.length > 0) {
                int[] newArr = new int[arr.length - 1];
                for (int i = 0; i < newArr.length; i++) {
                    int index = random.nextInt(arr.length-1);
                    newArr[i] = arr[index];
                }
                arr = newArr;
                System.out.println(Arrays.toString(arr));
            }
        }
    public static void main(String[] args) {
            RandomArray test= new RandomArray();
            test.eraseArray();
    }
}