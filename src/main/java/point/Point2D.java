package point;

public class Point2D {
    private int x, y;
    private static int compteur = 0;

    public Point2D() {
        this(0, 0);
    }

    public Point2D(int x, int y) {
        this.x = x;
        this.y = y;
        compteur++;
    }


    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void translater(int dx, int dy) {
        this.x += dx;
        this.y += dy;
    }

    public void afficher() {
        System.out.println("[" + this.toString() + "]");
    }

    public String toString() {
        return "" + x + ", " + y;
    }

    public static int getCompteur() {
        return compteur;
    }
}
