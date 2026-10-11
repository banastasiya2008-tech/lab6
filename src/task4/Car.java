package task4;

class Car implements Comparable {

    private int price;
    private int year; // рік виготовлення
    private int horsePower;

    public Car(int price, int year, int horsePower) {
        this.price = price;
        this.year = year;
        this.horsePower = horsePower;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public int compareTo(Object o) {
        Car other = (Car) o;

        // 1) "більше" той, у кого менша ціна
        if (this.price < other.price) {
            return 1;
        }
        if (this.price > other.price) {
            return -1;
        }

        // 2) ціни рівні: "більше" той, що новіший (менший за віком)
        if (this.year > other.year) {
            return 1;
        }
        if (this.year < other.year) {
            return -1;
        }


        if (this.horsePower > other.horsePower) {
            return 1;
        }
        if (this.horsePower < other.horsePower) {
            return -1;
        }

        return 0;
    }

    @Override
    public String toString() {
        return "Car(price=" + price + ", year=" + year + ", hp=" + horsePower + ")";
    }
}