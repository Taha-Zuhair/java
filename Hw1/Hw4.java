import java.sql.SQLOutput;

public class Hw4 {
    public static void main(String[] args) {
        int IntialBalance=1000;
        double YearIntrest=0.05;
        int Intrest=0;
        double SalaryAfter3Years=0;
        int Year=1;
        do {
            Intrest+=IntialBalance*YearIntrest;
            Year++;
        }
        while (Year<=3);
        SalaryAfter3Years=IntialBalance+Intrest;
        System.out.println(SalaryAfter3Years);
    }
}
