package ss4_class_and_object_in_java.bai_tap;

public class Fan {
    public Fan() {
    }

    private static final int SLOW = 1, MEDIUM = 2, FAST = 3;
    public int speed = SLOW;
    public boolean status = false;
    public double radius = 5;
    public String color = "blue";

    public int getSpeed() {
        return speed;
    }

    public boolean isStatus() {
        return status;
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

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        if (isStatus()) {
            return "Fan{" +
                    "speed=" + speed +
                    ", status=" + status +
                    ", radius=" + radius +
                    ", color='" + color + '\'' +
                    '}';
        } else {
            return "Fan{" +
                    ", status=" + status +
                    ", radius=" + radius +
                    ", color='" + color + '\'' +
                    '}';
        }
    }

    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setStatus(true);
        // vì thiết lập các hằng là static nên có thể truy cập biến hằng từ class
        fan1.setSpeed(Fan.FAST);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        System.out.println(fan1);
        Fan fan2 = new Fan();
        fan2.setSpeed(Fan.MEDIUM);
        fan2.setRadius(5);
        System.out.println(fan2);
    }
}
