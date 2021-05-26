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

        System.out.println("Car Factory");
        CarFactory renaultCarFactory = CarFactory.getCarFactory("RenaultCarFactory", 120L);
        System.out.println(
                String.format(
                        "На заводе %s работает %d сотрудников",
                        renaultCarFactory.getFactoryName(),
                        renaultCarFactory.getWorkersAmount()
                )
        );
        renaultCarFactory.setWorkersAmount(250L);
        System.out.println(
                String.format(
                        "На заводе %s работает %d сотрудников",
                        renaultCarFactory.getFactoryName(),
                        renaultCarFactory.getWorkersAmount()
                )
        );
    }

    private void run() {
        System.out.println(runText);
    }
}
