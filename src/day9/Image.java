package day9;

public class Image implements Rotatable {
    @Override
    public void rotateClockWise(double angle) {
        System.out.println("roatting clockwise : " + angle);
    }

    @Override
    public void rotateCounterClockWise(double angle) {
        System.out.println("roatting ant-clockwise : " + angle);
    }
}
