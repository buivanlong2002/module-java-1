public class MovablePoint extends Point {
    private float xSpeed, ySpeed;
    public MovablePoint() {}
    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public float getXSpeed() {
        return xSpeed;
    }
    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }
    public float getYSpeed() {
        return ySpeed;
    }
    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float[] speed) {
        this.xSpeed = speed[0];
        this.ySpeed = speed[1];
    }
    public float[] getSpeed() {
        return new float[]{xSpeed, ySpeed};
    }
    @Override
    public String toString() {
        return "Point= (" + getX() + ", " + getY() + "), speed= (" + getXSpeed() + ", " + getYSpeed() + ")";
    }
    public MovablePoint move() {
        setX(getX() + xSpeed);
        setY(getY() + ySpeed);
        return this;
    }
}
