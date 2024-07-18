public class Race {
    private String winnerName = "";
    private int distance = 0;
    private int winnerDistance = 0;
    private int time = 24;

    public String getWinnerName() {
        return winnerName;
    }

    public void calculateDistance(Car car) {

        distance = time * car.speed;

        if (distance > winnerDistance) {
            winnerDistance = distance;
            winnerName = car.name;
        }
    }
}
