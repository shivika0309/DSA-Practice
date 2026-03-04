import java.util.Scanner;
public class AmbitiousKidk {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[] arr=new int[N];

        if(N==0){
            System.out.println("0");
            return;
        }

        for(int i=0;i<N;i++) {
            arr[i] = sc.nextInt();
        }

        int min=100000+1;

        for(int i=0;i<N;i++){
            if(arr[i]<0){
                if(-1*arr[i]<min){
                    min=-1*arr[i];

                }
            }
            else{
                if(arr[i]<min){
                    min=arr[i];

                }
            }
        }
        
            System.out.println(min);
        
    }
}
 
