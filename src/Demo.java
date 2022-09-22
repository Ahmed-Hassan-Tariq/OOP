
public class Demo {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle();

        rectangle1.setLength(5);
        rectangle1.setWidth(5);
        rectangle1.setX(5);
        rectangle1.setY(5);

        Rectangle rectangle2 = new Rectangle();

        rectangle2.setLength(10);
        rectangle2.setWidth(10);
        rectangle2.setX(10);
        rectangle2.setY(15);

        System.out.println(rectangle1.intersection(rectangle2));

        System.out.println("R1 length = " + rectangle1.getLength() + "R1 width = " + rectangle1.getWidth());
        System.out.println("R2 length = " + rectangle2.getLength() + "R2 width = " + rectangle2.getWidth());

    }
}