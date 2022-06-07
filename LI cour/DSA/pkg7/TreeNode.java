package pkg7;

public class TreeNode {
    private Integer data;
    private TreeNode leftChild;
    private TreeNode rightChild;

    public TreeNode(Integer data) {
        this.data = data;
    }

    public Integer getData() {
        return data;
    }

    public TreeNode getRightChild() {
        return rightChild;
    }

    public void setRightChild(TreeNode rightChild) {
        this.rightChild = rightChild;
    }

    public TreeNode getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(TreeNode leftChild) {
        this.leftChild = leftChild;
    }

    public TreeNode find(int data) {
        if (this.data == data) {
            return this;
        }
        if (data <= this.data && leftChild != null) {
            return this.leftChild.find(data);
        }
        if (data >= this.data && rightChild != null) {
            return this.rightChild.find(data);
        }
        return null;

    }
}
