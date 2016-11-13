package fh.java.model.dreid;

/**
 * Created by Jakob on 09.11.2016.
 */
public class Zylinder extends dreid {

    public double radius;
    public double height;


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


    private double calcVolumen() { return Math.PI * Math.pow(radius,2) * height }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Zylinder{");
        sb.append("radius=").append(radius);
        sb.append(", height=").append(height);
        sb.append(", volumen=").append(volumen);
        sb.append(", surface=").append(surface);
        sb.append('}');
        return sb.toString();
    }
}
