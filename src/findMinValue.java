public class findMinValue {
    public static void main(String[] args) {
        int[] num = {10, 11, 3, 5, 7, 9};
        System.out.println(min(num));
    }
    static int min(int[] num) {
        int ans = num[0];
        for (int i = 0; i < num.length; i++) {
            if(num[i] < ans){
                ans = num[i];
            }
        }
        return ans;
    }

}
