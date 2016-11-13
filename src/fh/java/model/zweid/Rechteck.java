package fh.java.model.zweid;

import fh.java.model.GeometricShape;

/**
 * Created by Jakob on 09.11.2016.
 */
public class Rechteck extends zweid {

    private double sideA;
    private double sideB;

    public Rechteck(int x, int y,double sideA, double sideB) {
        this.x=x;
        this.y=y;
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double calcArea() {
        return sideA * sideB;
    }

    @Override
    public double calcPerimeter() {
        return 2*sideA + 2*sideB;
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

        Rechteck rechteck = (Rechteck) o;

        if (Double.compare(rechteck.sideA, sideA) != 0) return false;
        return Double.compare(rechteck.sideB, sideB) == 0;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(sideA);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(sideB);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    public String toString() {
        final StringBuffer sb = new StringBuffer("Rechteck{");
        sb.append(", area=").append(calcArea());
        sb.append(", perimeter=").append(calcPerimeter());
        sb.append('}');
        return sb.toString();



}
}
