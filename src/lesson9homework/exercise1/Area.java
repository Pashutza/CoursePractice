package lesson9homework.exercise1;

public class Area {
    private double length;
    private double width;

    public void setDim(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }
}
