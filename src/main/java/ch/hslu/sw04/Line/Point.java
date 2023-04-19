package ch.hslu.sw04.Line;

public class Point 
{
    private int x, y;

    /**
     * Konstruktor für Objekte der Klasse point
     */
    public Point(int newX, int newY) 
    { x = newX;
        y = newY;
    }

    public int getQuadrant (int x,int y) 
    {
        if ((x == 0) || (y == 0))
        {
            return 0;
        }
        if (x>0){if (y>0)
            {
                return 1;
            }
            else
            { 
                return 4; 
            }
        }else{ 
            if (y>0){
                return 2;
            }else
            { 
                return 3;
            }
        }
    }
    
    public void setX (int newX)
    { 
        x = newX; 
    }
     public void setY(int newY){
        y = newY;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
}

