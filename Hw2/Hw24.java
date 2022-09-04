package Hw2;

import java.util.Scanner;

public class Hw24 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        float n1,n2,n3,avg;
        System.out.println("enter the three numbers :");
        n1=input.nextFloat();
        n2=input.nextFloat();
        n3=input.nextFloat();
        avg=(n1+n2+n3)/3;
        System.out.println("avg="+avg);
    }
}
