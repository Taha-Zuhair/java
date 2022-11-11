import java.util.Scanner;
public class Q5 {
    public static void main(String[] args) {
        String a;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter The word : ");
        a=in.next();
        int n=0;
        for (int i=0;i<a.length();i++)
        {
            char r = a.charAt(i);
            if(r=='a'||r=='o'||r=='i'||r=='e'||r=='u'||r=='y')
                n++;
        }
        System.out.println(n);
    }
}

