import java.util.Scanner;

public class HW35 {  public static void main(String[] args) {
    int a,b,c;
    Scanner input=new Scanner(System.in);
    System.out.println("enter the 3 number: ");
    a=input.nextInt();
    b=input.nextInt();
    c=input.nextInt();
    if (a==b&&b==c)
        System.out.println("all the same");
    else if (a!=b&&b!=c&&a!=c)
        System.out.println("all different");
    else System.out.println("neither");
}
}
