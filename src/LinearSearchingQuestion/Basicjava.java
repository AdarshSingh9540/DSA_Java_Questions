package LinearSearchingQuestion;
import java.util.Arrays;

public class Basicjava {
//
//    public static void main(String[] args) {
//        int target = 5;
//        int[] arr = {7,2,13,18,12,85,5,45};

//        boolean ans = check(arr,target);
//        System.out.println(ans);
//        System.out.println(findDigit(arr));
//        System.out.println(digit(-1234));
//    }
 //   public static boolean check(int[] arr,int target) {
//        for(int i=0;i<arr.length;i++){
//            if(target==arr[i]){
//                return true;
//            }
//        }
//        return false;
 //   }

//    public  static  int findDigit(int[] nums){
//       int count=0;
//       for(int num:nums){
//           if(even(num)){
//              count++;
//           }
//       }
//       return count;
//    }
//
//    private static boolean even(int num) {
//        int noOfDigit = digit(num);
//        if(noOfDigit%2==0){
//            return true;
//        }
//        return false;
//    }
//
//    static int digit(int num){
//        if(num<0){
//            num=num*-1;
//        }
//        if(num==0){
//            return 1;
//        }
//        int count=0;
//          while (num>0){
//              count++;
//              num=num/10;
//          }
//
//       return count;
//    }
//public static void main(String[] args) {
//    int[] arr = {18, 12, -7, 3, 14, 28};
//    int target = 3456;
//    System.out.println(linearSearch(arr, target, 1, 4));
//}
//
//    static int linearSearch(int[] arr, int target, int start, int end) {
//        if (arr.length == 0) {
//            return -1;
//        }
//
//        // run a for loop
//        for (int index = start; index <= end; index++) {
//            // check for element at every index if it is = target
//            int element = arr[index];
//            if (element == target) {
//                return index;
//            }
//        }
        // this line will execute if none of the return statements above have executed
        // hence the target not found
//        return -1;
//    }


        public static void main(String[] args) {
            int[][] arr = {
                    {23, 4, 1},
                    {18, 12, 3, 9},
                    {78, 99, 34, 56},
                    {18, 12}
            };
            int target = 56;
            int[] ans = search(arr,target); // format of return value {row, col}
            System.out.println(Arrays.toString(ans));

            System.out.println(max(arr));

            System.out.println(Integer.MIN_VALUE);
        }

        static int[] search(int[][] arr, int target) {
            for (int row = 0; row < arr.length; row++) {
                for (int col = 0; col < arr[row].length; col++) {
                    if (arr[row][col] == target) {
                        return new int[]{row, col};
                    }
                }
            }
            return new int[]{-1, -1};
        }

        static int max(int[][] arr) {
            int max = Integer.MIN_VALUE;
            for (int[] ints : arr) {
                for (int element : ints) {
                    if (element > max) {
                        max = element;
                    }
                }
            }
            return max;
        }

}
