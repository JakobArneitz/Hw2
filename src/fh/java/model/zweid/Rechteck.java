package fh.java.model.zweid;

import fh.java.model.GeometricShape;

/**
 * Created by Jakob on 09.11.2016.
 */
public class Rechteck extends GeometricShape {

    public double sideA;
    public double sideB;

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

    public String toString() {
        final StringBuffer sb = new StringBuffer("Rechteck{");
        sb.append(", area=").append(calcArea());
        sb.append(", perimeter=").append(calcPerimeter());
        sb.append('}');
        return sb.toString();


}
