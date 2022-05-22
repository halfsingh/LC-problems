import java.awt.*;

public class Tree {
    double HeightFt;
    double trunkdiameterInches;
    TreeType treeType;
    static Color TRUNK_COLOR = new Color(102, 51, 0);

    Tree(double HeightFt, double trunkdiameterInches, TreeType treeType) {
        this.HeightFt = HeightFt;
        this.trunkdiameterInches = trunkdiameterInches;
        this.treeType = treeType;
    }

    void grow() {
        this.HeightFt = this.HeightFt + 10;
        this.trunkdiameterInches = this.trunkdiameterInches + 1;

    }

    void announceTallTree() {
        if (this.HeightFt > 100) {
            System.out.println("Thats a tall " + this.treeType + " tree!");
        }
    }

    static void announceTree() {
        System.out.println("Look out for that tree!");
    }
}