import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {

    private static List<List<Node>> colorGrid = new ArrayList<>();

    public static void createColorGrid(int col, int row){
        List<String> colorList = new ArrayList<>(Arrays.asList("blue", "red", "green"));

        for(int i=0; i<row; i++){
            List<Node> gridRow = new ArrayList<>();

            for(int j=0; j<col; j++){

                int randomIndex = (int) (Math.random() * colorList.size());
                String randomColor = colorList.get(randomIndex);

                Node node = new Node(randomColor, i, j);
                gridRow.add(node);
            }
            colorGrid.add(gridRow);
        }
    }

    public static void showColorGrid(){

        for (List<Node> row : colorGrid){
            for (Node node : row){
                System.out.print(String.format("%-8s", node.getColor().toUpperCase()));
            }
            System.out.println();
        }
    }

    public static void setNeighbours(){
        for(List<Node> row : colorGrid){
            for(Node current : row){
                int rowIndex = current.getX();
                int colIndex = current.getY();

                if (colIndex < row.size() - 1) {
                    current.setNeighbourRight(colorGrid.get(rowIndex).get(colIndex + 1));
                }else if (colIndex > 0){
                    current.setNeighbourLeft(colorGrid.get(rowIndex).get(colIndex - 1));
                }else if (rowIndex < colorGrid.size() - 1) {
                    current.setNeighbourBottom(colorGrid.get(rowIndex + 1).get(colIndex));
                }else if (rowIndex > 0){
                    current.setNeighbourTop(colorGrid.get(rowIndex - 1).get(colIndex));
                }
            }
        }
    }


    public static Node moveToRight(Node current){
        System.out.println(current);
        Node next = current.getNeighbourRight();
        if(next != null && next.getColor().equals(current.getColor())){
            moveToRight(next);
        }
        return current;
    }

    public static Node moveToLeft(Node current){
        Node previous = current.getNeighbourLeft();
        if(previous != null && previous.getColor().equals(current.getColor())){
            moveToLeft(previous);
        }
        return current;
    }

    public static Node moveToUp(Node current){
        Node up = current.getNeighbourTop();
        if(up != null && up.getColor().equals(current.getColor())){
            moveToUp(up);
        }
        return current;
    }

    public static Node moveToDown(Node current){
        Node down = current.getNeighbourBottom();
        if(down != null && down.getColor().equals(current.getColor())){
            moveToDown(down);
        }
        return current;
    }


    public static void findLargestBlock(){

        List<Node> largestBlocks = new ArrayList<>();
        int cursorX = 0;
        int cursorY = 0;

        while(cursorX < colorGrid.size()-1 || cursorY < colorGrid.size()-1){
            Node current = colorGrid.get(cursorX).get(cursorY);
            int lastRightIndex = moveToRight(current).getY();
            int count = lastRightIndex - cursorY;
            System.out.println(lastRightIndex);
            break;
        }

    }

    public static void main(String[] args) {

        createColorGrid(5,5);
        showColorGrid();
        setNeighbours();

        findLargestBlock();


//        System.out.println(colorGrid.get(2).get(2).getNeighbourRight());

    }
}
