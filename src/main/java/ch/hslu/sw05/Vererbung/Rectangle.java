
package ch.hslu.sw05.Vererbung;

/**
 * Beschreiben Sie hier die Klasse Rectangel.
 *
 * @author (Ihr Name)
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Rectangle extends Shape {

    private int width;
    private int height;

    /**
     * Konstruktor für Objekte der Klasse Rectangel
     */
    public Rectangle(int x, int y, int width, int height) {
        super(x, y);
        this.width = width;
        this.height = height;

    }

    public void changeDimension(int newWidth, int newHeight) {
        this.width = newWidth;
        this.height = newHeight;
    }

    public int getWidth() {
        return this.width;
    }

    public int getHeight() {
        return this.height;
    }

    @Override
    public double getPerimeter() {
        return (2 * this.width) + (2 * this.height);
    }

    @Override
    public double getArea() {
        return this.width * this.height;
    }
}
