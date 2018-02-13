package com.company;
import java.util.*;

public class Main {
    static long sum = 0;

    public static void main(String[] args) {
        //boolean start = true;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a hexadecimal number: ");
                String hexInput = scanner.next();
                hexInput = hexInput.toUpperCase();
                if(hexInput.substring(0,2).equalsIgnoreCase("0x"))
                {
                    hexInput = hexInput.substring(2, hexInput.length());
                }

                int length = hexInput.length()-1; // length = number of characters


        int iteration = 0;
        while(length >= 0){
            int value = 0; // starts at zero

            if(Character.isDigit(hexInput.charAt(length))){
                sum += (((int)hexInput.charAt(length) - 48) * Math.pow(16, iteration));
                length--;
                iteration++;

            }
            else
            {
                sum += (((int)hexInput.charAt(length) - 55) * Math.pow(16, iteration));
                length--;
                iteration++;
            }

        }
        System.out.println("Your number is " + sum + " in decimal");

        }
    }