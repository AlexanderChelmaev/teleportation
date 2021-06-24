import omelet.Omelet;
import technics.Car;
import technics.Renault;
import technics.Toyota;

import java.util.ArrayList;

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
        Omelet omelet = new Omelet.Builder(3, 3).tomatoAmount(4).build();
        omelet.printOmelet();

        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Toyota(190, "White"));
        cars.add(new Renault(180, "Blue"));
        System.out.println(cars);

        for (Car car : cars) {
            if (car instanceof Toyota) {
                ((Toyota) car).setSpeed(250);
            }
            if (car instanceof Renault) {
                ((Renault) car).setColor("Хакки");
            }
        }
        System.out.println(cars);
    }

    private void run() {
        System.out.println(runText);
    }
}
