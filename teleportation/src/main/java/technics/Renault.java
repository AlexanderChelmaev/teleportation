package technics;

public class Renault {
    private int speed;
    private String color;
    private int WD;

    public Renault(int speed, String color) {
        this.speed = speed;
        this.color = color;
    }

    public int getSpeed() {
        return speed;
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

    public int getWD() {
        return WD;
    }

    public void setWD(int WD) {
        this.WD = WD;
    }
}
