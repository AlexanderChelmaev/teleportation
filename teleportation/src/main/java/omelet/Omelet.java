package omelet;

public class Omelet {

    private final int eggsAmount;
    private final int pinchSaltAmount;
    private final int tomatoAmount;
    private final int leafGreenery;

    public static class Builder {
        private final int eggsAmount;
        private final int pinchSaltAmount;

        private int tomatoAmount = 0;
        private int leafGreenery = 0;

        public Builder(int eggsAmount, int pinchSaltAmount) {
            this.eggsAmount = eggsAmount;
            this.pinchSaltAmount = pinchSaltAmount;
        }

        public Builder tomatoAmount(int tomatoAmount) {
            this.tomatoAmount = tomatoAmount;
            return this;
        }

        public Builder leafGreenery(int leafGreenery) {
            this.leafGreenery = leafGreenery;
            return this;
        }

        public Omelet build() {
            return new Omelet(this);
        }
    }

    private Omelet(Builder builder) {
        this.eggsAmount = builder.eggsAmount;
        this.pinchSaltAmount = builder.pinchSaltAmount;
        this.tomatoAmount = builder.tomatoAmount;
        this.leafGreenery = builder.leafGreenery;
    }

    public void printOmelet() {
        System.out.println(String.format(
                "Яичница состоит из: %d яиц, %d щепоток соли, %d кусочков помидор и %d листов петрушки.",
                eggsAmount,
                pinchSaltAmount,
                tomatoAmount,
                leafGreenery
        ));
    }
}
