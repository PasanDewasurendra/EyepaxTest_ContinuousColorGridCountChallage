public class Node {
    private String color;
    private int x;
    private int y;
    private Node left;
    private Node right;
    private Node top;
    private Node bottom;

    public Node(String color, int x, int y) {
        this.color = color;
        this.x = x;
        this.y = y;
    }

    public Node(String color, int x, int y, Node left, Node right, Node top, Node bottom) {
        this.color = color;
        this.x = x;
        this.y = y;
        this.left = left;
        this.right = right;
        this.top = top;
        this.bottom = bottom;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Node getNeighbourLeft() {
        return left;
    }

    public void setNeighbourLeft(Node left) {
        this.left = left;
    }

    public Node getNeighbourRight() {
        return right;
    }

    public void setNeighbourRight(Node right) {
        this.right = right;
    }

    public Node getNeighbourTop() {
        return top;
    }

    public void setNeighbourTop(Node top) {
        this.top = top;
    }

    public Node getNeighbourBottom() {
        return bottom;
    }

    public void setNeighbourBottom(Node bottom) {
        this.bottom = bottom;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Node{");
        sb.append("color='").append(color).append('\'');
        sb.append(", x=").append(x);
        sb.append(", y=").append(y);
        sb.append('}');
        return sb.toString();
    }
}
