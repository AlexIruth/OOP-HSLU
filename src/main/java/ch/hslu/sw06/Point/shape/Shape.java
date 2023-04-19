package ch.hslu.sw06.Point.shape;
/**
 * Beschreiben Sie hier die Klasse Shape.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public abstract class Shape
{
    private int x;
    private int y;

    /**
     * Konstruktor für Objekte der Klasse Shape
     */
    protected Shape(int x, int y)
    { this.x = x;
      this.y = y;
    }

    /**
     * Ein Beispiel einer Methode - ersetzen Sie diesen Kommentar mit Ihrem eigenen
     * 
     * @param  y    ein Beispielparameter für eine Methode
     * @return        die Summe aus x und y
     */
    public void move (int newX, int newY)
    {
        this.x = newX;
        this.y = newY;
    }
    
    public final int getX()
    {
        return this.x;
    }
    
    public final int getY()
    {
      return this.y;
    }
    
    public abstract double getPerimeter();
    
    public abstract double getArea();
    

}
