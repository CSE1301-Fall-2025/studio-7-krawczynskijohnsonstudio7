
public class Rectangle2 {
    private double length;
    private double width;

    public Rectangle2(int nLength, int nWidth) {
        this.length = nLength;
        this.width = nWidth;
    }

    public double getArea() {
        return this.length * this.width;
    }

    public double getPerimeter() {
        return (2 * this.length) + (2 * this.width);
    }

    public double getLength() {
        return this.length;
    }

    public double getWidth() {
        return this.width;
    }

    public boolean isSquare() {
        if (this.length == this.width)
            return true;
        else
            return false;
    }

    public static boolean isBigger(Rectangle2 rectangle1, Rectangle2 rectangle2) {
        if (rectangle1.getArea() > rectangle2.getArea()) {
            System.out.println(rectangle1 + " is bigger than " + rectangle2 + ".");
            return true;
        } else
            return false;
    }


    public static void main(String[] args) {
        Rectangle2 r1 = new Rectangle2(9, 9);
        Rectangle2 r2 = new Rectangle2(4, 5);
        System.out.println(r1.getArea());
        System.out.println(r2.getArea());
        isBigger(r1, r2);
        System.out.println(r1.isSquare());
        System.out.println(r2.isSquare());

    }

}
