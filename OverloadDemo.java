public class OverloadDemo {

    // Signature 1: enroll(String)
    void enroll(String courseCode) {
        System.out.println("Enrolled in course: " + courseCode);
    }

    // Signature 2: enroll(String, int)
    void enroll(String courseCode, int section) {
        System.out.println("Enrolled in course: " + courseCode + ", Section: " + section);
    }

    // Signature 3: enroll(int)
    void enroll(int numericCourseCode) {
        System.out.println("Enrolled in numeric course code: " + numericCourseCode);
    }

    /*
    // INVALID OVERLOAD ATTEMPT (Differs only by return type - will cause compiler error):
    int enroll(String courseCode) {
        return 1;
    }
    */

    public static void main(String[] args) {
        OverloadDemo demo = new OverloadDemo();

        // 3 Valid Calls
        System.out.println("--- Valid Calls ---");
        demo.enroll("CSC241");          // Calls enroll(String)
        demo.enroll("CSC241", 2);       // Calls enroll(String, int)
        demo.enroll(241);               // Calls enroll(int)

        // Invalid Calls (Commented out so it compiles)
        // demo.enroll();              // ERROR: No matching method with 0 arguments
        // demo.enroll("CSC241", "2");  // ERROR: No matching method for (String, String)
    }
}