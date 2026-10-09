package week3.geometry;


public class Segment {
    private Point p1;
    private Point p2;

    public Segment(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public Segment(float x1, float y1, float x2, float y2) {
        p1 = new Point(x1, y1);
        p2 = new Point(x2, y2);
    }

    public Point getP1() {
        return p1;
    }

    public void setP1(Point p1) {
        this.p1 = p1;
    }

    public Point getP2() {
        return p2;
    }

    public void setP2(Point p2) {
        this.p2 = p2;
    }

    public void translate(float dx, float dy) {
        p1.translate(dx, dy);
        p2.translate(dx, dy);
    }

    public float length() {
        return p1.distance(p2);
    }

    public boolean equals(Segment s) {
        if (s == null) return false;

        return (p1.equals(s.p1) && p2.equals(s.p2))
            || (p1.equals(s.p2) && p2.equals(s.p1));
    }

    public float getSlope() {
        return (p2.getY() - p1.getY()) /
               (p2.getX() - p1.getX());
    }

    public float getIntercept() {
        return p1.getY() - getSlope() * p1.getX();
    }

    public boolean isOnLine(Point p) {
        float dx = p2.getX() - p1.getX();
        float dy = p2.getY() - p1.getY();

        float cross = (p.getX() - p1.getX()) * dy
                    - (p.getY() - p1.getY()) * dx;

        return Math.abs(cross) < 0.0001f;
    }

    public boolean isOnSegment(Point p) {
        if (!isOnLine(p)) {
            return false;
        }

        float minX = Math.min(p1.getX(), p2.getX());
        float maxX = Math.max(p1.getX(), p2.getX());
        float minY = Math.min(p1.getY(), p2.getY());
        float maxY = Math.max(p1.getY(), p2.getY());

        return p.getX() >= minX && p.getX() <= maxX
            && p.getY() >= minY && p.getY() <= maxY;
    }
}
