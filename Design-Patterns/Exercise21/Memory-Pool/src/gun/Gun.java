package gun;

import bullet.Bullet;
import bullet.BulletPool;

import java.util.ArrayList;
import java.util.List;

public class Gun {
    private final int bulletCount = 1000;

    public void fire() {
        List<Bullet> plist = new ArrayList<>();
        for (int i = 0; i < bulletCount; i++) {
            Bullet p = new Bullet();
            p.setPosition(0);
            plist.add(p);
            for (int j = 0; j < plist.size(); j++) {
                Bullet pp = plist.get(j);
                pp.move();
                System.out.print("-" + pp.getPosition());
                if (pp.getPosition() == 10) {
                    plist.remove(pp);
                    j--;
                }
            }
            System.out.println();
        }
    }

    public void fireInPool() {
        BulletPool pool = new BulletPool();
        List<Bullet> plist = new ArrayList<>();
        for (int i = 0; i < bulletCount; i++) {
            Bullet p = pool.newItem();
            p.setPosition(0);
            plist.add(p);
            for (int j = 0; j < plist.size(); j++) {
                Bullet pp = plist.get(j);
                pp.move();
                System.out.print("-" + pp.getPosition());
                if (pp.getPosition() == 10) {
                    pool.freeItem(pp);
                    plist.remove(pp);
                    j--;
                }
            }
            System.out.println();
        }
    }
}
