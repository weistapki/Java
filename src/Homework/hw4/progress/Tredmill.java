package Homework.hw4.progress;

public class Tredmill extends Obstracle{
    public Tredmill(String nameOfObstacle, double obstacleTypeSize) {
        super(nameOfObstacle, obstacleTypeSize);
    }
    @Override
    public boolean overcome(Particepant particepant) {
        return particepant.getLenght() >= getObstacleTypeSize();
    }


}
