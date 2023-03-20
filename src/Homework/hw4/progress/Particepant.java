package Homework.hw4.progress;

public abstract class Particepant {
    private final String name;
    private final int lenght;
    private final int hight;

    public Particepant(String name, int lenght, int hight) {
        this.name = name;
        this.lenght = lenght;
        this.hight = hight;
    }

    public String getName() {
        return name;
    }

    public int getLenght() {
        return lenght;
    }

    public int getHight() {
        return hight;
    }
}
