package technics;

public class Toyota implements Car {

    private int speed;
    private String color;
    private String modelName;
    private int maxSpeed;
    private int wheelRadius;

    public Toyota(int speed, String color) {
        this.speed = speed;
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public String getModelName() {
        return modelName;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getWheelRadius() {
        return wheelRadius;
    }

    public void setWheelRadius(int wheelRadius) {
        this.wheelRadius = wheelRadius;
    }
}
