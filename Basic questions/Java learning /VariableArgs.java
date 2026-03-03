import java.util.Arrays;
public class VariableArgs{
	public static void main(String[] args) {
		display(2,4,6,3);
	}
	
	public static void display(int ...v){
	    System.out.println(Arrays.toString(v));
}
}
