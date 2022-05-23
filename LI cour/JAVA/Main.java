public class Main {

    public static void main(String[] args) {
        Tree myfavoriteOakTree = new Tree(125, 5, TreeType.OAK);
        Tree myfavoriteMapleTree = new Tree(90, 30, TreeType.MAPLE);
        // myfavoriteOakTree.announceTallTree();
        // myfavoriteMapleTree.announceTallTree();
        System.out.println(myfavoriteOakTree.getHeightFt());
        System.out.println(myfavoriteMapleTree.getHeightFt());
        System.out.println(myfavoriteOakTree.gettrunkdiameterInches());
        System.out.println(myfavoriteMapleTree.gettrunkdiameterInches());
        System.out.println(myfavoriteOakTree.gettreeType());
        System.out.println(myfavoriteMapleTree.gettreeType());

        myfavoriteMapleTree.grow();
        System.out.println(myfavoriteMapleTree.getHeightFt());
    }
}
