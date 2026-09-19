public class Task1Demo {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.studentId = "CIIT/SP26-BAI-001/LHR";
        s1.name = "Abeer Amina";
        s1.completedCredits = 15;

        Student s2 = new Student();
        s2.studentId = "CIIT/SP26-BAI-002/LHR";
        s2.name = "Ali Ishtiaq";
        s2.completedCredits = 20;

        Student s3 = new Student();
        s3.studentId = "CIIT/SP26-BAI-003/LHR";
        s3.name = "Abdul Rehman Azam";
        s3.completedCredits = 12;

        System.out.println("Before change");
        System.out.println(s1.summary());
        System.out.println(s2.summary());
        System.out.println(s3.summary());

        s2.addCredits(5);

        System.out.println("\n After change");
        System.out.println(s1.summary());
        System.out.println(s2.summary());
        System.out.println(s3.summary());
    }
}