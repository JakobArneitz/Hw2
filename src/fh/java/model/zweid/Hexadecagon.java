package fh.java.model.zweid;

import fh.java.model.GeometricShape;

/**
 * Created by Jakob on 09.11.2016.
 */
public class Hexadecagon extends zweid {

    private double edge;

    public Hexadecagon(int x, int y, double radius) {
        this.x = x;
        this.y = y;
        this.edge = edge;
    }

    public double calcArea() {return 4 * Math.pow(edge,2)* 1/Math.tan(Math.toRadians(22));

    }


    public double calcPerimeter() { return 16 * edge;

    }

    @Override
    public double calcVolumen() {
        return 0;
    }

    @Override
    public double calcSurface() {
        return 0;
    }

    public double getEdge() {return edge;}

    public void setEdge(double edge) {
        this.edge = edge;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Hexadecagon{");
        sb.append("edge=").append(edge);
        sb.append(", area=").append(calcArea());
        sb.append(", perimeter=").append(calcPerimeter());
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Hexadecagon that = (Hexadecagon) o;

        return Double.compare(that.edge, edge) == 0;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(edge);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
