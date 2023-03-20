package Homework.hw4.figures;

public class Triangle implements Area {
    private final double sizeOne;
    private final double sizeTwo;
    private final double sizeThree;

    public Triangle(double sizeOne, double sizeTwo, double sizeThree) {
        this.sizeOne = sizeOne;
        this.sizeTwo = sizeTwo;
        this.sizeThree = sizeThree;
    }

    @Override
    public double area() {
        double perimetr = (sizeOne + sizeTwo + sizeThree) / 2;
        return Math.sqrt(perimetr * (perimetr - sizeOne) * (perimetr - sizeTwo) * (perimetr - sizeThree));
    }
}
