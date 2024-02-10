public class MountionBike implements Bicyle {
    private int seatHeight;
    private int gear;
    private int speed;

    public MountionBike(int startHeight, int startSpeed, int startGear){
        seatHeight = startHeight;
        speed = startSpeed;
        gear = startGear;
    }

    @Override
    public void applyBrake(int decrement) {
        speed -= decrement;
    }

    @Override
    public void speedUp(int increment) {
        speed += increment;
    }

    public int getGear() {
        return gear;
    }
    public int getSpeed(){
        return speed;
    }
}
