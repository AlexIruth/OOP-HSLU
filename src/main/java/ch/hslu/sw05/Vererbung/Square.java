package ch.hslu.sw05.Vererbung;

public class Square extends Shape {

    private int width;

    /**
     * Konstruktor für Objekte der Klasse Square
     */
    public Square(int x, int y, int width) {
        super(x, y);
        this.width = width;
    }

    public void ChangeDimension(int newWidth, int newHeight) {
        this.width = newWidth;
    }

    public int getWidth() {
        return this.width;
    }

    @Override
    public double getPerimeter() {
        return this.width * 4;
    }

    @Override
    public double getArea() {
        return this.width * this.width;
    }

}
