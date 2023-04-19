package ch.hslu.sw05.Vererbung;

public class Circle extends Shape {

    private double diameter;
     

    public Circle(int x, int y, double diameter) {
        super(x, y);
        this.diameter = diameter;
      
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * this.diameter;
    }

    @Override
    public double getArea() {
        return this.diameter * Math.PI;
    }

}
