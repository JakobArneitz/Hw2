package fh.java.model.zweid;

import fh.java.model.GeometricShape;

/**
 * Created by Jakob on 09.11.2016.
 */
public class Kreis extends GeometricShape {

    private double radius;

    public Kreis(int x, int y, double radius) {
        this.x=x;
        this.y=y;
        this.radius = radius;
    }

    public double getRadius() {return radius};

    public void setRadius(double radius) {
        this.radius = radius;
    };

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Kreis{");
        sb.append("radius=").append(radius);
        sb.append(", area=").append(calcArea());
        sb.append(", perimeter=").append(calcPerimeter());
        sb.append('}');
        return sb.toString();
    }

    @Override
    public double calcArea() {return Math.PI * Math.pow(radius,2);

    }

    @Override
    public double calcPerimeter() { return Math.PI * radius * 2;

    }
}
