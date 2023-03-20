package Homework.hw4.figures;

public class Square implements Area {
    private final double size;

    public Square(double size) {
        this.size = size;
    }

    @Override
    public double area() {
        return size * size;
    }
}
