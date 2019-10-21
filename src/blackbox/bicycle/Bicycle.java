package blackbox.bicycle;

class Bicycle {
    private int gear;
    private int speed;

    Bicycle(int gear, int speed) {
        this.gear = gear;
        this.speed = speed;
    }

    public void applyBrake(int decrement) {
        speed -= decrement;
    }

    public void speedUp(int increment) {
        speed += increment;
    }

    public String toString() {
        return("No of gears are "+ gear + "\n" + "speed of bicycle is "+ speed);
    }
}

class MountainBike extends Bicycle {
    private int seatHeight;

    MountainBike(int gear, int speed, int startHeight) {
        super(gear, speed);
        seatHeight = startHeight;
    }

    public void setHeight(int newValue) {
        seatHeight = newValue;
    }

    @Override
    public String toString() {
        return (super.toString() + "\nseat height is "+ seatHeight);
    }

}
