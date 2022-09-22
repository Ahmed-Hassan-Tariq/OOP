
public class Rectangle {

    private double length;
    private double width;
    private int x;
    private int y;


    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (this.length >= 0) {
            this.length = length;
        }
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (this.width > 0.0) {
            this.width = width;
        }
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public boolean intersection(Rectangle another) {
        if ((this.getX()+this.getLength() > (another.getX())||((this.getY()+this.getWidth()) > (another.getY())))) {
            return true;
        } else {
            return false;
        }
    }
}
