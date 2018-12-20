import java.util.Arrays;

public class Prison_cell {
    public static void main(String args[]){
        int []cells={0,1,0,1,1,0,0,1};
        int[]cells_result=new int[cells.length];
        for(int k=0;k<7;k++) {
            for (int i = 1; i < cells.length - 1; i++) {
                if (cells[i - 1] == 0 && cells[i + 1] == 0 || cells[i - 1] == 1 && cells[i + 1] == 1) {
                    cells_result[i] = 1;
                } else {
                    cells_result[i] = 0;
                }
            }
            cells = cells_result.clone();
        }
        System.out.println(Arrays.toString(cells));
    }
}
