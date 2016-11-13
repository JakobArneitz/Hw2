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

    public double calcArea() {return 4 * Math.pow(edge,2)* (Math.tan)^-1;

    }


    public double calcPerimeter() { return 16 * edge;

    }

    public double getEdge() {return edge};

    public void setEdge(double edge) {
        this.edge = edge;
    };

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Hexadecagon{");
        sb.append("edge=").append(edge);
        sb.append(", area=").append(calcArea());
        sb.append(", perimeter=").append(calcPerimeter());
        sb.append('}');
        return sb.toString();
    }
}
