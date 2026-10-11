package task2;

public class Task2Main {
    public static void main(String[] args) {
        Movable p = new Point(1.5, 2.5);
        System.out.println(p);

        p.setX(10);
        p.setY(20);
        System.out.println(p.getX() + ", " + p.getY());

        p.moveTo(-3, 4.5);
        System.out.println(p);
    }
}