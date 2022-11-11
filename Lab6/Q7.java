import java.util.Scanner;
public class Q7 {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number:");
        int a=sc.nextInt();
        int n=a;
        while(n!=0){
            System.out.println(n%2);
            n/=2;
        }
    }
}

