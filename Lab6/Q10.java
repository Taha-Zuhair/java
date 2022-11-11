import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        int x=0;
        int a=0;
        int y;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter The dollar price today : ");
        x=in.nextInt();
        System.out.println("Enter dollar value : ");
        a=in.nextInt();
        y=a*x;
        System.out.println("the cost after the converts:");
        System.out.println(y);


    }

}


