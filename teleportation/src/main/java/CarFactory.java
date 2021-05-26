public class CarFactory {
    private final String factoryName;
    private Long workersAmount;

    private CarFactory(String factoryName) {
        this.factoryName = factoryName;
    }

    public static CarFactory getCarFactory(String factoryName, Long workersAmount) {
        CarFactory carFactory = new CarFactory(factoryName);
        carFactory.setWorkersAmount(workersAmount);
        return carFactory;
    }

    public void setWorkersAmount(Long workersAmount) {
        this.workersAmount = workersAmount;
    }

    public String getFactoryName() {
        return factoryName;
    }

    public Long getWorkersAmount() {
        return workersAmount;
    }
}
