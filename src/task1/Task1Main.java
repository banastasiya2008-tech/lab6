package task1;

public class Task1Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Пушок");
        Cat cat = new Cat("Димка");

        System.out.println(dog.getName() + ": " + dog.makeSound());
        System.out.println(cat.getName() + ": " + cat.makeSound());
    }
}