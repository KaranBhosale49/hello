import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no to check if armstrong :");
        int n= sc.nextInt();
        int a=0,t=0,j=n;
        while (j>0){
            a=j%10;
          j=j/10;
          t+=a*a*a;
        }
        if(n==t){
            System.out.println(t + ": It is armstrong number");
        }

    }
}
