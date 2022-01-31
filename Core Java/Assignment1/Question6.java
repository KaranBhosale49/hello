import java.util.Arrays;
import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        int []arr ={5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
        Scanner sc=new Scanner(System.in);
        System.out.println(" Enter the no ");
        int n=sc.nextInt();
        for(int i=0;i<arr.length;i++){
            if(n==i){
                System.out.format("Value %d is present in array",n);
            }
            else if(i==arr.length-1){
                System.out.println("Value is not present in Array");
            }
        }
    }
}
