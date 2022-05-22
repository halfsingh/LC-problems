public class Main {

    public static void main(String[] args) {
        Tree myfavoriteOakTree = new Tree(125, 5, TreeType.OAK);
        Tree myfavoriteMapleTree = new Tree(90, 30, TreeType.MAPLE);
        myfavoriteOakTree.announceTallTree();
        myfavoriteMapleTree.announceTallTree();
        Tree.announceTree();
    }
}
