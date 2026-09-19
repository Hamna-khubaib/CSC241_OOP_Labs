public class AIExperiment {
    String experimentName;
    int completedEpochs;
    int targetEpochs;

    // Overload 1: Basic run
    void runEpochs(int epochs) {
        completedEpochs += epochs;
    }

    void runEpochs(int epochs, int bonusEpochs) {
        completedEpochs += (epochs + bonusEpochs);
    }

    int remainingEpochs() {
        int remaining = targetEpochs - completedEpochs;
        return remaining;
    }

    String status() {
        return "Experiment: " + experimentName + " | Completed: " + completedEpochs + "/" + targetEpochs;
    }
}