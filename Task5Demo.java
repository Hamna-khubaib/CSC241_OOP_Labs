public class Task5Demo {

    public static void modifyExperiment(AIExperiment exp) {
        exp.completedEpochs += 5;
    }

    public static void main(String[] args) {
        // Two independent objects
        AIExperiment exp1 = new AIExperiment();
        exp1.experimentName = "CNN Image Classifier";
        exp1.completedEpochs = 10;
        exp1.targetEpochs = 50;

        AIExperiment exp2 = new AIExperiment();
        exp2.experimentName = "LLM Fine-tuning";
        exp2.completedEpochs = 20;
        exp2.targetEpochs = 100;

        System.out.println("INITIAL STATE");
        System.out.println(exp1.status());
        System.out.println(exp2.status());

        // Overloaded methods
        exp1.runEpochs(10);
        exp2.runEpochs(15, 5);

        System.out.println("\n AFTER METHOD CALLS ");
        System.out.println(exp1.status() + " | Remaining: " + exp1.remainingEpochs());
        System.out.println(exp2.status() + " | Remaining: " + exp2.remainingEpochs());

        // Pass-by-value mutation experiment
        modifyExperiment(exp1);
        System.out.println("\nAFTER HELPER MUTATION ON EXP1");
        System.out.println(exp1.status());
        System.out.println(exp2.status());
    }
}