package pkg7;

public class TreeNode {
    private Integer data;
    private TreeNode leftChild;
    private TreeNode rightChild;
    private boolean isdeleted = false;

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
        if (this.data == data && !isdeleted) {
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

    public void insert(int data) {
        if (data >= this.data) {
            if (this.rightChild == null) {
                this.rightChild = new TreeNode(data);
            } else {
                this.rightChild.insert(data);
            }
        } else {
            if (this.leftChild == null) {
                this.leftChild = new TreeNode(data);
            } else {
                this.leftChild.insert(data);
            }
        }
    }

    public void delete() {
        this.isdeleted = true;
    }

    public boolean isdeleted() {
        return isdeleted;
    }

    public int smallest() {
        TreeNode current = this;
        while (this.getLeftChild() != null) {
            current = current.getLeftChild();
        }
        return current.data;
    }

    public int largest() {
        TreeNode current = this;
        while (this.getRightChild() != null) {
            current = current.getRightChild();
        }
        return current.data;
    }
}
