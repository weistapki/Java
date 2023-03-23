package Homework.hw4.barrier;

public abstract class Obstracle {
    private final String nameOfObstacle;
    private final double obstacleTypeSize;
    public abstract boolean overcome(Particepant particepant);

    public Obstracle(String nameOfObstacle, double obstacleTypeSize) {
        this.nameOfObstacle = nameOfObstacle;
        this.obstacleTypeSize = obstacleTypeSize;
    }
    public String getNameOfObstacle() {
        return nameOfObstacle;
    }
    public double getObstacleTypeSize() {
        return obstacleTypeSize;
    }
}
