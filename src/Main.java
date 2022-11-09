public class Main {

    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setSpeed(fan1.getMaxSpeed());
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOn(true);
        if (fan1.isOn()) {
            System.out.println("Fan 1: " + fan1.toString() + ". Fan is on");
        }

        Fan fan2 = new Fan();
        fan2.setSpeed(fan2.getMedSpeed());
        fan2.setRadius(5);
        fan2.setColor("blue");
        fan2.setOn(false);
        if (!fan2.isOn()) {
            System.out.println("Fan 2: " + fan2.toString() + ". Fan is off");
        }
    }
}