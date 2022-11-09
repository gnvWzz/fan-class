public class Fan {
    private static final int SLOW = 1;
    private static final int MEDIUM = 2;
    private static final int FAST = 3;
    private int speed = SLOW;
    private boolean isOn = false;
    private double radius = 5;
    private String color = "blue";

    public int getSpeed() {
        return speed;
    }

    public int getMedSpeed() {
        return this.speed = MEDIUM;
    }

    public int getMaxSpeed() {
        return this.speed = FAST;
    }

    public boolean isOn() {
        return isOn;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Fan() {
    }

    public Fan(int speed, int radius, String color) {
        this.speed = speed;
        this.radius = radius;
        this.color = color;
    }

    @Override
    public String toString() {
//        String info = "{ " + getSpeed() + ", " + getRadius() + ", " + getColor() + " }";
        return "{" + getSpeed() + ", " + getRadius() + ", " + getColor() + "}";
    }
}
