public class Point {
    private float x, y;
    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public Point() {}
    public float getX() {
        return x;
    }
    public float getY() {
        return y;
    }
    public void setX(float x) {
        this.x = x;
    }
    public void setY(float y) {
        this.y = y;
    }
    public float[] getXY(){
        return new float[] {x, y};
    }
    public void setXY(float[] xy){
        this.x = xy[0];
        this.y = xy[1];
    }
    @Override
    public String toString() {
        return "Point(" + x + ", " + y + ")";
    }
}
