//search in 2D Array and count no of digits with even no of digits 
import java.util.Arrays;
import java.util.Scanner;
public class TwoDimArraySearch{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] arr={{1,2,3,4},
                     {5,6,7,8,-19},
                     {6,5,7,8}};//not necessarily int[][] arr=new int[][] {1,2,3,4},{5,6,7,8},.....
                     int[] ans=findElement(arr,n);
                    System.out.println(Arrays.toString(ans)) ;//to print array
                    
                    System.out.println(countEvenDigit(arr));
    }
    
    public static int[] findElement(int[][] arr, int find){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==find){
                    return new int[]{i,j};//can't say return new{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
    
    public static int countEvenDigit(int[][]arr){
        
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j:arr[i]){
                
                if(j<0){
                    j=j*-1;
                }
                
                int digits=(int)(Math.log10(j)+1);
                if (digits%2==0){
                count++;
                }
            }
        }
        return count;
    }
}
