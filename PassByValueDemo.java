public class PassByValueDemo {

    // Helper method for Experiment A
    public static void changeNumber(int x) {
        System.out.println("  [Inside changeNumber] Before assignment: x = " + x);
        x = 99;
        System.out.println("  [Inside changeNumber] After assignment: x = " + x);
    }

    // Helper method for Experiment B
    public static void changeStudent(Student st) {
        System.out.println("  [Inside changeStudent] Before modification: credits = " + st.completedCredits);
        st.completedCredits = 99;
        System.out.println("  [Inside changeStudent] After modification: credits = " + st.completedCredits);
    }

    // Helper method for Experiment C
    public static void replaceStudent(Student st) {
        System.out.println("  [Inside replaceStudent] Before reassignment: name = " + st.name);
        st = new Student();
        st.name = "Temporary";
        System.out.println("  [Inside replaceStudent] After reassignment: name = " + st.name);
    }

    public static void main(String[] args) {
        // Experiment A: Primitive Pass-by-Value
        System.out.println("Experiment A: Primitive Variable ");
        int num = 10;
        System.out.println("Before method call: num = " + num);
        changeNumber(num);
        System.out.println("After method call: num = " + num);

        // Experiment B: Object Reference Mutation
        System.out.println("\nExperiment B: Object Reference Mutation");
        Student s = new Student();
        s.studentId = "CIIT/SP26-BAI-003/LHR";
        s.name = "Abdul Rehman Azam";
        s.completedCredits = 12;
        System.out.println("Before method call: credits = " + s.completedCredits);
        changeStudent(s);
        System.out.println("After method call: credits = " + s.completedCredits);

        // Experiment C: Object Reference Reassignment
        System.out.println("\n Experiment C: Object Reference Reassignment");
        System.out.println("Before method call: name = " + s.name);
        replaceStudent(s);
        System.out.println("After method call: name = " + s.name);
    }
}