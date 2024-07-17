public class Race {
    String winnerName = "";
    int distance = 0;
    int winnerDistance = 0;
    int time = 24;

    public void calculateDistance(Car car) {

        distance = time * car.speed;

        if (distance > winnerDistance) {
            winnerDistance = distance;
            winnerName = car.name;
        }
    }
}
