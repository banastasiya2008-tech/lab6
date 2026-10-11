package task1;

class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    String makeSound() {
        return "Гав-гав!";
    }
}
