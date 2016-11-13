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

    public double getRadius() {return radius;}

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

    @Override
    public double calcVolumen() {
        return 0;
    }

    @Override
    public double calcSurface() {
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Kreis kreis = (Kreis) o;

        return Double.compare(kreis.radius, radius) == 0;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(radius);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
