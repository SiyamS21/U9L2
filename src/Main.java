public class Main {
    public static void main(String[] args) {
        Skeleton a = new Skeleton(100, 30);
        a.levelUp();
        System.out.println(a.getLevel());
        System.out.println(a.getSkeletonNum());
        System.out.println(a.getHealth());
        // should print:
        //Skeleton #1 has spawned!
        //Health: 100
        //Level: 30
        //Skeleton #1 has leveled up to level 31!
        //31
        //1
        //100

        NoBowSkeleton b = new NoBowSkeleton(200, 45, false);
        System.out.println(b.hasSword());
        b.getSword();
        System.out.println(b.hasSword());
        b.getSword();
        b.levelUp();
        System.out.println(b.getLevel());
        System.out.println(b.getSkeletonNum());
        System.out.println(b.getHealth());
        //should print:
        //Skeleton #2 has spawned!
        //Health: 200
        //Level: 45
        //Skeleton #2 is a melee skeleton WITHOUT a sword!
        //false
        //Skeleton #2 has now gained a sword!
        //true
        //Skeleton #2 has tried to pick up a sword... but he already has one.
        //Skeleton #2 has leveled up to level 46!
        //46
        //2
        //200

        BowSkeleton c = new BowSkeleton(300, 60, 20);
        c.shoot();
        System.out.println(c.getArrows());
        c.levelUp();
        System.out.println(c.getLevel());
        System.out.println(c.getSkeletonNum());
        System.out.println(c.getHealth());
        // should print:
        //Skeleton #3 has spawned!
        //Health: 300
        //Level: 60
        //Skeleton #3 is a skeleton with a bow that has 20 arrows!
        //Skeleton #3 has shot and now has 19 arrows!
        //19
        //Skeleton #3 has leveled up to level 61!
        //61
        //3
        //300
    }
}