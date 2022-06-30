public class Node {
    private String color;
    private int x;
    private int y;
    private Node neighbourLeft;
    private Node neighbourRight;
    private Node neighbourTop;
    private Node neighbourBottom;

    public Node(String color, int x, int y) {
        this.color = color;
        this.x = x;
        this.y = y;
    }

    public Node(String color, int x, int y, Node neighbourLeft, Node neighbourRight, Node neighbourTop, Node neighbourBottom) {
        this.color = color;
        this.x = x;
        this.y = y;
        this.neighbourLeft = neighbourLeft;
        this.neighbourRight = neighbourRight;
        this.neighbourTop = neighbourTop;
        this.neighbourBottom = neighbourBottom;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Node getNeighbourLeft() {
        return neighbourLeft;
    }

    public void setNeighbourLeft(Node neighbourLeft) {
        this.neighbourLeft = neighbourLeft;
    }

    public Node getNeighbourRight() {
        return neighbourRight;
    }

    public void setNeighbourRight(Node neighbourRight) {
        this.neighbourRight = neighbourRight;
    }

    public Node getNeighbourTop() {
        return neighbourTop;
    }

    public void setNeighbourTop(Node neighbourTop) {
        this.neighbourTop = neighbourTop;
    }

    public Node getNeighbourBottom() {
        return neighbourBottom;
    }

    public void setNeighbourBottom(Node neighbourBottom) {
        this.neighbourBottom = neighbourBottom;
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
        sb.append(", neighbourLeft=").append(neighbourLeft);
        sb.append(", neighbourRight=").append(neighbourRight);
        sb.append(", neighbourTop=").append(neighbourTop);
        sb.append(", neighbourBottom=").append(neighbourBottom);
        sb.append('}');
        return sb.toString();
    }
}
