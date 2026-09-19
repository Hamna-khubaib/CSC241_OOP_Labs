public class Task2Demo {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.studentId = "CIIT/SP26-BAI-001/LHR";
        s1.name = "Abeer Amina";
        s1.completedCredits = 15;

        Student s2 = new Student();
        s2.studentId = "CIIT/SP26-BAI-002/LHR";
        s2.name = "Ali Ishtiaq";
        s2.completedCredits = 20;

        // Methods testing on two objects
        System.out.println("--- STUDENT 1 SUMMARY ---");
        System.out.println(s1.summary());
        System.out.println("Remaining credits for degree (130): " + s1.remainingCredits(130));

        System.out.println("\n--- STUDENT 2 SUMMARY ---");
        s2.addCredits(10);
        System.out.println(s2.summary());
        System.out.println("Remaining credits for degree (130): " + s2.remainingCredits(130));
    }
}