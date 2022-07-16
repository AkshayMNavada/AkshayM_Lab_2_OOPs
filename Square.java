public class Square extends Rectangle{
    Square(String color, int side) {
        super(color, side, side);
    }

    @Override
    public double calculateArea() {
        return super.length * super.width;
    }
}
