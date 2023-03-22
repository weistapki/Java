package Homework.hw4.barrier;

public class Main {
    public static void main(String[] args) {

        Particepant[] particepants = {
                new Cat("Musik", 7, 3),
                new Human("Pankrat", 4, 4),
                new Robot("R2D2", 6, 6)};
        Obstracle[] obstacles = {
                new Wall("wall", 4),
                new Tredmill("long", 6)};

        for (Particepant particepant : particepants) {
            for (Obstracle obstacle : obstacles) {
                if (!obstacle.overcome(particepant)) {
                    System.out.println(
                            "Particepant "
                                    + particepant.getName()
                                    + " don't get the obstacle "
                                    + obstacle.getNameOfObstacle()
                                    + " on tredmill "
                                    + obstacle.getObstacleTypeSize());
                    break;
                } else {
                    System.out.println("Particepant "
                            + particepant.getName()
                            + " get the obstacle "
                            + obstacle.getNameOfObstacle()
                            + " on tredmill "
                            + obstacle.getObstacleTypeSize());
                }
            }
        }
    }
}
