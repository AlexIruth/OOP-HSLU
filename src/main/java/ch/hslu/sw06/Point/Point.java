
public class Point {

    private int x, y;

    /**
     * Konstruktor für Objekte der Klasse point
     */
    public Point(int newX, int newY) {
        x = newX;
        y = newY;
    }

    /**
     * Zweiter Konstruktor Copy Konstruktor
     */
    public Point(Point point) {
        this.x = point.getX();
        this.y = point.getY();
    }

    public int getQuadrant(int x, int y) {
        if ((x == 0) || (y == 0)) {
            return 0;
        }
        if (x > 0) {
            if (y > 0) {
                return 1;
            } else {
                return 4;
            }
        } else {
            if (y > 0) {
                return 2;
            } else {
                return 3;
            }
        }
    }

    public void setX(int newX) {
        x = newX;
    }

    public void setY(int newY) {
        y = newY;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void moveRelative(int x, int y) {
        this.x = this.x + x;

        this.y = this.y + y;
    }

    public void moveRelative(Point newPoint) {
        moveRelative(newPoint.x, newPoint.y);

    }

    public void moveRelative(double alpha, int amount) {
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object instanceof Point) {
            return this.x == ((Point) object).x
                    && this.y == ((Point) object).y;
        } else {
            return false;
        }
    }

}
