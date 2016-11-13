package fh.java.model.dreid;

/**
 * Created by Jakob on 09.11.2016.
 */
public class Würfel extends dreid{

    private double a;


    public Würfel(int x, int y, double a) {
        this.x = x;
        this.y = y;
        this.a = a;

    }


    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Würfel würfel = (Würfel) o;

        return Double.compare(würfel.a, a) == 0;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(a);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Würfel{");
        sb.append("a=").append(a);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public double calcArea() {
        return 0;
    }

    @Override
    public double calcPerimeter() {
        return 0;
    }

    @Override
    public double calcVolumen() {
        return Math.pow(a,3);
    }

    @Override
    public double calcSurface() {
        return 6 * Math.pow(a,2);
    }
}
