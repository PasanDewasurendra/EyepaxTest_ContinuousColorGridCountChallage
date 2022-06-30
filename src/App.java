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

    public static void findLargestBlock(){

        List<Node> largestBlocks = new ArrayList<>();

        for(List<Node> row : colorGrid){
            for(Node current : row){

            }
        }
    }

    public static void main(String[] args) {

        createColorGrid(5,5);
        showColorGrid();

    }
}
