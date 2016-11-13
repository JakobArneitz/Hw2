package fh.java.model.dreid;

/**
 * Created by Jakob on 09.11.2016.
 */
public class Prisma extends dreid {

    private double c;
    private double hc;
    private double height;
    private double a;
    private double b;

    public Prisma(int x, int y, double a, double b, double c, double hc, double height) {
        this.x = x;
        this.y = y;
        this.c = c;
        this.hc = hc;
        this.height = height;
        this.a = a;
        this.b = b;

    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getHc() {
        return hc;
    }

    public void setHc(double hc) {
        this.hc = hc;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
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
        return c*hc/2 * height;
    }

    @Override
    public double calcSurface() {
        return (a+b+c) * height +  c*hc/2 * 2;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Prisma{");
        sb.append("c=").append(c);
        sb.append(", hc=").append(hc);
        sb.append(", height=").append(height);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Prisma prisma = (Prisma) o;

        if (Double.compare(prisma.c, c) != 0) return false;
        if (Double.compare(prisma.hc, hc) != 0) return false;
        if (Double.compare(prisma.height, height) != 0) return false;
        if (Double.compare(prisma.a, a) != 0) return false;
        return Double.compare(prisma.b, b) == 0;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(c);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(hc);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(height);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(a);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(b);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}