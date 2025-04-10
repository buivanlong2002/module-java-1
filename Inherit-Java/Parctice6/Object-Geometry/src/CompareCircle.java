public class CompareCircle extends Circle implements Comparable<CompareCircle> {
    public CompareCircle() {}
    public CompareCircle(double radius) {
        super(radius);
    }
    public CompareCircle(double radius, String color, boolean filled) {
        super(radius, color, filled);
    }
    @Override
    public int compareTo(CompareCircle o) {
//        if (getRadius() == o.getRadius()) return 0;
//        else if (getRadius() < o.getRadius()) return -1;
//        else return 1;
        return Double.compare(getRadius(), o.getRadius());
    }
}

