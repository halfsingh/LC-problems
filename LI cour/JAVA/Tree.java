import java.awt.*;

public class Tree {
    private double HeightFt;
    private double trunkdiameterInches;
    private TreeType treeType;
    static Color TRUNK_COLOR = new Color(102, 51, 0);

    public Tree(double HeightFt, double trunkdiameterInches, TreeType treeType) {
        this.HeightFt = HeightFt;
        this.trunkdiameterInches = trunkdiameterInches;
        this.treeType = treeType;
    }

    public double getHeightFt() {
        return this.HeightFt;
    }

    public double gettrunkdiameterInches() {
        return this.trunkdiameterInches;
    }

    public TreeType gettreeType() {
        return this.treeType;
    }

    public void settrunkdiameterInches(double trunkdiameterInches) {
        this.trunkdiameterInches = trunkdiameterInches;
    }

    public void grow() {
        this.HeightFt = this.HeightFt + 10;
        this.trunkdiameterInches = this.trunkdiameterInches + 1;

    }

    public void announceTallTree() {
        if (this.HeightFt > 100) {
            System.out.println("Thats a tall " + this.treeType + " tree!");
        }
    }

    static void announceTree() {
        System.out.println("Look out for that tree!");
    }
}