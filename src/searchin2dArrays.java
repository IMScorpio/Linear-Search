import java.util.Arrays;

public class searchin2dArrays {
    public static void main(String[] args) {
       int[][] arr = {
               {1, 3, 5, 7},
               {0, 2, 4, 6, 8},
               {-1, -2, -3}
       };
       int target = 8;
       int[] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));

    }
    static int[] search(int[][] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] == target){
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }


}
