import java.util.Arrays;

public class searchMinvalueIn2darray {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 3, 5, 7},
                {0, 2, 4, 6, 8},
                {-1, -2, -3}
        };
        int target = 8;

        System.out.println(min(arr));

    }
    static int min(int[][] arr){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] < min){
                    min = arr[i][j];
                }
            }
        }
        return min;
    }
}
