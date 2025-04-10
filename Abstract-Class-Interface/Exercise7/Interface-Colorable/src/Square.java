public class Square extends Rectangle implements Colorable {
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
    public void howToColor(){
        System.out.println("Color all sides of a square");
    }
    @Override
    public String toString() {
        return "A Square with area= " + getArea();
    }
}
