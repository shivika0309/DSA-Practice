import java.util.Scanner;
public class GoalsOfVictory {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        
        for(int s=0;s<t;s++){
            int sum=0;
            int l=sc.nextInt();
            int[] arr=new int[l-1];
            for(int i=0;i<l-1;i++){  //input of array elements
                arr[i]=sc.nextInt();
                sum+=arr[i];
            }

            System.out.println(-1*sum);
        }
    }
}
//little help 
