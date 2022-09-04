package Hw2;

import java.util.Scanner;

public class Hw23 {public static void main(String[] args) {
    Scanner input =new Scanner(System.in);
    float len,width, area,perimater;
    System.out.println("enter the len of rectanglar");
    len= input.nextFloat();
    System.out.println("enter the width of rectanglar");
    width=input.nextFloat();
    area= len*width;
    perimater=2*len*width;
    System.out.println("area="+area);
    System.out.println("perimater="+perimater);
}}
