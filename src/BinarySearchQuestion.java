import java.util.*;

class Main {
    public static void main(String[] args) {
        int[] arr = {1111, 823, 755, 639, 578, 423, 81, 7};
        int target = 1111;
        // int ans = binarySearch(arr, target);
        // System.out.print(ans);

      int ans = orderAgnosticMethod(arr, target);
      System.out.print(ans);
    }

    // static int binarySearch(int[] arr, int target){
    //   int  s = 0;
    //   int e = arr.length-1;
    //   while(s<=e){
    //     int m =  s+(e-s)/2;
    //     if(arr[m]>target){
    //       e=m-1;
    //     }else if(arr[m]<target){
    //       s=s+1;
    //     }else{
    //       return m;
    //     }
    //   }
    //   return -1;

    static int orderAgnosticMethod(int[] arr, int target) {
        int s = 0;
        int e = arr.length - 1;
        boolean isAsc = arr[s] < arr[e];
        while (s <= e) {
            int m = s + (e - s) / 2;
            if (arr[m] == target) {
                return m;
            }
            if (isAsc) {
                if (target < arr[m]) {
                    e = m - 1;
                } else {
                    s = m + 1;
                }
            } else {
                if (target > arr[m]) {
                    e = m - 1;
                } else {
                    s = m + 1;
                }
            }
        }
        return -1;
    }
}
