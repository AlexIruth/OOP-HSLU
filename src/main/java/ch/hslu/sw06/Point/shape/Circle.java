package ch.hslu.sw06.Point.shape;

public final class Circle extends Shape
{
    private double diameter;
    
    public Circle(int x, int y, double diameter)
    {super (x,y);
     this.diameter = diameter;
    }
    
    public void setDiameter(double diameter)
    {
        this.diameter = diameter;
    }
    
    public double getDiameter()
    {
       return diameter;
    }
   
    
    @Override
    public double getPerimeter()
    {
        return 2*Math.PI * this.diameter;  
    }
    @Override
    public double getArea()
    {
        return this.diameter * Math.PI;
    } 
    
 

    public static void main(String[] args)       
    {
     Shape shape = new Circle(3,4,7);
     shape.move(1,2);
     ((Circle)shape).getDiameter();
    }
}
