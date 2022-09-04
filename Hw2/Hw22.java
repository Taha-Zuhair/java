package Hw2;

import java.util.Scanner;

public class Hw22 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        double pi=3.14;
        double r,area,perimater;
        System.out.println("enter the radius of circle");
        r= input.nextDouble();
        area=pi*Math.pow(r,2);
        perimater=2*pi*r;
        System.out.println("area="+area);
        System.out.println("perimater="+perimater);

    }
}

