import java.util.Scanner;
public class DaytonaCost{

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        for(int i=0;i<t;i++){
            int l=sc.nextInt();
            int k=sc.nextInt();
            int arr[]=new int[l];
            boolean flag=false;
            for(int j=0;j<l;j++) {
                arr[j] = sc.nextInt();
            }

            for(int j:arr){
                if(j==k){
                    System.out.println("YES");
                    flag=true;
                    break;
                }
            }


            if(flag==false){
                System.out.println("NO");
            }

        }
    }

}
