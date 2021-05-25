public class Runner {
    private final String runText;

    public Runner(String runText) {
        this.runText = runText;
    }

    public void executeApp() {
        run();
    }

    private void run() {
        System.out.println(runText);
    }
}
