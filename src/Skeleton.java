public class Skeleton {
    private static int nextSkeletonNum = 1;
    private int skeletonNum;
    private int health;
    private int level;

    public Skeleton(int h, int l) {
        health = h;
        level = l;
        skeletonNum = nextSkeletonNum;
        nextSkeletonNum++;
        System.out.println("Skeleton #" + skeletonNum + " has spawned!\nHealth: " + health + "\nLevel: " + level);
    }

    public void levelUp() {
        level++;
        System.out.println("Skeleton #" + skeletonNum + " has leveled up to level " + level + "!");
    }

    public int getSkeletonNum() {
        return skeletonNum;
    }

    public int getHealth() {
        return health;
    }

    public int getLevel() {
        return level;
    }
}
