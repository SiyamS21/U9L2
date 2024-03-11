public class Main {
    public static void main(String[] args) {
        Skeleton a = new Skeleton(100, 30);
        a.levelUp();
        System.out.println(a.getLevel());
        System.out.println(a.getSkeletonNum());
        System.out.println(a.getHealth());

        NoBowSkeleton b = new NoBowSkeleton(200, 45, false);
        System.out.println(b.hasSword());
        b.getSword();
        System.out.println(b.hasSword());
        b.getSword();
        b.levelUp();
        System.out.println(b.getLevel());
        System.out.println(b.getSkeletonNum());
        System.out.println(b.getHealth());

        BowSkeleton c = new BowSkeleton(300, 60, 20);
    }
}