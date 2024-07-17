import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Race race = new Race();
        Car car;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите участников:");


        for (int i = 0; i < 3; i++) {
            int carNumber = i + 1;
            String carName;
            int carSpeed;

            System.out.println("Введите название машины №" + carNumber + ":");
            carName = scanner.next();



            while (true) {
                System.out.println("Введите скорость машины №" + carNumber + ":");
                carSpeed = scanner.nextInt();

                if (carSpeed > 250 || carSpeed < 0) {
                    System.out.println("Неверная скорость машины, попробуйте еще раз. " +
                            "Значение от 0 до 250.");
                } else {
                    break;
                }
            }

            car = new Car(carName, carSpeed);
            race.calculateDistance(car);
        }

        System.out.println("Самая быстрая машина: " + race.winnerName);
    }
}
