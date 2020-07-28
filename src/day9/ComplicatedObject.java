package day9;

public class ComplicatedObject {
    int height;
    int width;
    int breadth;
    int x;
    int y;

    private ComplicatedObject(int height, int width, int breadth, int x, int y) {
        this.height = height;
        this.width = width;
        this.breadth = breadth;
        this.x = x;
        this.y = y;
    }

    public static class Builder {
        int height;
        int width;
        int breadth;
        int x;
        int y;

        public Builder withDimensions(int height, int width, int breadth) {
            this.height = height;
            this.width = width;
            this.breadth = breadth;
            return this;
        }

        public Builder withPosition(int x, int y) {
            this.x = x;
            this.y = y;
            return this;
        }

        public ComplicatedObject build() {
            return new ComplicatedObject(
                    this.height,
                    this.height,
                    this.breadth,
                    this.x,
                    this.y
            );
        }
    }
}
