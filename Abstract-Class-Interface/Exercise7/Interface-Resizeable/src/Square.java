public class Square extends Rectangle implements Resizeable{
    private double side;
    public Square(){
        side = 1.0;
    }
    public Square(double side) {
        super(side, side);
        this.side = side;
    }
    @Override
    public double getArea() {
        return side * side;
    }
    @Override
    public void resize(double percent) {
        side *= (percent + 100.0) / 100.0;
        super.resize(percent);
    }
    @Override
    public String toString() {
        return "A Square with area= " + getArea();
    }
}
