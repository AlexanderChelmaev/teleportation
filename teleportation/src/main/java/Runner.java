public class Runner {
    private final String runText;

    public Runner(String runText) {
        this.runText = runText;
    }

    public void executeApp() {
        run();

        System.out.println("Learn GIT");
        System.out.println("Learn GIT and Konsole");
        System.out.println("Cat");
        System.out.println("Dog");

        for (int i = 0; i < 100; i++) {
            int j = 0;
            while (j < i) {
                System.out.print(" Pet ");
                j++;
            }
            System.out.println();
        }
    }

    private void run() {
        System.out.println(runText);
    }
}
