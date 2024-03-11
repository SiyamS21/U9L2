public class NoBowSkeleton extends Skeleton {
    private boolean hasSword;

    public NoBowSkeleton(int h, int l, boolean sword) {
        super(h, l);
        if (hasSword) {
            System.out.println("Skeleton #" + getSkeletonNum() + " is a melee skeleton WITH a sword!");
        }
        else {
            System.out.println("Skeleton #" + getSkeletonNum() + " is a melee skeleton WITHOUT a sword!");
        }
        hasSword = sword;
    }

    public void getSword() {
        if (hasSword) {
            System.out.println("Skeleton #" + getSkeletonNum() + " has tried to pick up a sword... but he already has one.");
        }
        else {
            hasSword = true;
            System.out.println("Skeleton #" + getSkeletonNum() + " has now gained a sword!");
        }
    }

    public boolean hasSword() {
        return hasSword;
    }
}
