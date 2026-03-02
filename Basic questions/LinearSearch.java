import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int find=sc.nextInt();
        int[] arr=new int[]{5,6,6,7,3,3};
        System.out.println(linearSearch(arr,find));
       
    }
    
    public static int linearSearch(int[] a,int find){
        
       for(int i=0;i<a.length;i++){
          if(a[i]==find){
              return i;
          }
      
          
       }
       return -1; 
    }
}
