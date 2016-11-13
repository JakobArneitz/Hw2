package fh.java.model.dreid;

/**
 * Created by Jakob on 09.11.2016.
 */
public class Zylinder extends dreid {

    private double radius;
    private double height;


    public Zylinder(int x, int y, double radius, double height) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.height = height;


    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }


    @Override
    public double calcArea() {
        return 0;
    }

    @Override
    public double calcPerimeter() {
        return 0;
    }

    public double calcVolumen() { return Math.PI * Math.pow(radius,2) * height;
    }

    @Override
    public double calcSurface() {
        return Math.PI * Math.pow(radius,2) * 2 + 2*radius*Math.PI*height;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Zylinder{");
        sb.append("radius=").append(radius);
        sb.append(", height=").append(height);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Zylinder zylinder = (Zylinder) o;

        if (Double.compare(zylinder.radius, radius) != 0) return false;
        return Double.compare(zylinder.height, height) == 0;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(radius);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(height);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
