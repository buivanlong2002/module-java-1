import gun.Gun;
import bullet.Bullet;

public class Main {
    public static void main(String[] args) {
        Gun gun = new Gun();
        System.out.println("Start");

        // TH1: Tạo mới 1000 đối tượng Bullet
        // gun.fire();

        // TH2: Tái sử dụng Bullet từ Object Pool
        gun.fireInPool();

        System.out.println("Game over");
        System.out.println("Total bullet created: " + Bullet.count);
    }
}
