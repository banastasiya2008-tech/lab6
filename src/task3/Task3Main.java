package  task3;

public class Task3Main {
    public static void main(String[] args) {
        Smartphone phone = new Smartphone("Phone X", 46.4825, 30.7233);

        double[] coords = phone.getCoordinates();
        System.out.println("Координати: " + coords[0] + ", " + coords[1]);

        phone.makeCall();
        phone.receiveCall();

        // доступ через інтерфейси
        GPS gps = phone;
        Cellular cellular = phone;
        System.out.println(gps.getCoordinates().length);
        cellular.makeCall();
    }
}