package com.campusdual.classroom;

public class Exercise29 {
    public static void main(String[] args) {
        try {
            int[] intArray = new int[]{1, 2, 3};
            int num = intArray[7];
            System.out.println(num);
        }catch (ArrayIndexOutOfBoundsException e){
        System.out.println("Error en: " + e);
        }
    }
}
