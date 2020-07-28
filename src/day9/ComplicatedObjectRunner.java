package day9;

public class ComplicatedObjectRunner {
    public static void main(String[] args) {
        ComplicatedObject.Builder builder = new ComplicatedObject.Builder();
        builder.withDimensions(10, 200, 34);
        builder.withPosition(5, 5);
        ComplicatedObject object1 = builder.build();


        ComplicatedObject object = new ComplicatedObject.Builder()
                .withDimensions(10, 20, 30)
                .withPosition(4, 4)
                .build();
    }
}
