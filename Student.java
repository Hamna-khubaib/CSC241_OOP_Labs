public class Student {
    String studentId;
    String name;
    int completedCredits;

    // Task 2: void method
    void addCredits(int credits) {
        completedCredits += credits;
    }

    // Task 2: method with local variable & return type
    int remainingCredits(int degreeCredits) {
        int remaining = degreeCredits - completedCredits;
        return remaining;
    }

    // Task 2: summary method
    String summary() {
        return "ID: " + studentId + ", Name: " + name + ", Credits: " + completedCredits;
    }
}