public class Q1_Test {
    public static void main(String[] args) {
        Q1 taha = new Q1(1000,10);
        taha.waitForBalance(1000000);
        System.out.println("your balance will be million after " +taha.getYear());
    }
}

