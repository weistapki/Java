package Homework.hw4.barrier;

public class Wall extends Obstracle{
    public Wall(String nameOfObstacle, double obstacleTypeSize) {
        super(nameOfObstacle, obstacleTypeSize);
    }
    @Override
    public boolean overcome(Particepant particepant) {
        return particepant.getHight() >= getObstacleTypeSize();
    }


}
