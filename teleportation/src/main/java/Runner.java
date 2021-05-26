import omelet.Omelet;

public class Runner {
    private final String runText;

    public Runner(String runText) {
        this.runText = runText;
    }

    public void executeApp() {
        run();

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

        System.out.println("\nЯичница");
        Omelet omelet = new Omelet(new Omelet.Builder(3, 3).setTomatoAmount(4));
        omelet.printOmelet();
    }

    private void run() {
        System.out.println(runText);
    }
}
