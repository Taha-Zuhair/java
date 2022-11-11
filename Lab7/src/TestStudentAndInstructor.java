public class TestStudentAndInstructor {
    public static void main(String[] args) {


        Student s = new Student("Ali", "1999", "BIT");
        System.out.println(s.toString());
        Instructor i = new Instructor("Mohammed", "1996", 20000);
        System.out.println(i.toString());

    }
}