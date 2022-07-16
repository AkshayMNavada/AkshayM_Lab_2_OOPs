public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle("Red",6,7);
        System.out.println("Area of rectangle is : " + rectangle.calculateArea());
        System.out.println("Perimeter of rectangle is : " + rectangle.calculatePerimeter());
        rectangle.renderer.draw();
        rectangle.renderer.draw("This is a rectangle");
        System.out.println();

        Square square = new Square("Blue",8);
        System.out.println("Area of square is : " + square.calculateArea());
        rectangle.renderer.draw();
        rectangle.renderer.draw("This is a square");
        System.out.println();

        Circle circle = new Circle("Green",3);
        System.out.println("Area of circle is : " + circle.calculateArea());
        System.out.println("Perimeter of circle is : " + circle.calculatePerimeter());
        rectangle.renderer.draw();
        rectangle.renderer.draw("This is a circle");
        System.out.println();

        Triangle triangle = new Triangle("Yellow",4,5);
        System.out.println("Area of triangle is : " + triangle.calculateArea());
        System.out.println("Perimeter of triangle is : " + triangle.calculatePerimeter());
        rectangle.renderer.draw();
        rectangle.renderer.draw("This is a triangle");
        System.out.println();
    }

}
