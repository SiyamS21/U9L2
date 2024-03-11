public class BowSkeleton extends Skeleton {
    private int arrows;

    public BowSkeleton(int h, int l, int a) {
        super(h, l);
        arrows = a;
        System.out.println("Skeleton #" + getSkeletonNum() + " is a skeleton with a bow that has " + a + " arrows!");
    }

    public void shoot() {
        if (arrows >= 1) {
            arrows--;
            System.out.println("Skeleton #" + getSkeletonNum() + " has shot and now has " + arrows + " arrows!");
        }
        else {
            System.out.println("Skeleton #" + getSkeletonNum() + " tried to shoot but has no arrows!");
        }
    }

    public int getArrows() {
        return arrows;
    }
}
