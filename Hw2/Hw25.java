package Hw2;

import java.util.Scanner;

public class Hw25 {
    public static void main(String[] args) {
        int var1,temp,var2;
        Scanner input=new Scanner(System.in);
        System.out.println("enter the two variables:");
        var1= input.nextInt();
        var2= input.nextInt();
        temp=var1;
        var1=var2;
        var2=temp;
        System.out.println("the variables after Swapping:    \n"+var1+"\n"+var2);
    }
}
