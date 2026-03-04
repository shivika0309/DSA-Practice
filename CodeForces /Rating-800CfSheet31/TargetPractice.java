import java.util.Scanner;
public class TargetPractice {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t--!=0){
            int total=0;
            char[][] arr=new char[10][10];
            for(int i=0;i<10;i++){
                String row=sc.next();
                for(int j=0;j<10;j++){
                    arr[i][j]=row.charAt(j);
                    if(arr[i][j]=='X'){
                        if(j==0||j==9||i==0||i==9)
                            total+=1;
                        else if(j==1||j==8||i==1||i==8)
                            total+=2;
                        else if(j==2||j==7||i==2||i==7)
                            total+=3;
                        else if(j==3||j==6||i==3||i==6)
                            total+=4;
                        else if(j==4||j==5||i==4||i==5)
                            total+=5;
                        }
                    }
                }
            System.out.println(total);
            }
        }
    }
 
