import java.util.* ;

class Main{
  public static void main(String[] args){
  int[][] arr = {{1,2,3},{4,55,6},{7,8,9}};
    int target = 55;
    int[] ans = search(arr,target);
    
    System.out.println(Arrays.toString(ans));
  }

  static int[] search(int[][] arr, int target){
    for(int i=0;i<arr.length;i++){
      for(int j=0;j<arr[0].length;j++){
        if(arr[i][j]==target){
          return new int[]{i,j};
        }
      }
    }
    return new int[]{-1,-1};
  }
  
}
