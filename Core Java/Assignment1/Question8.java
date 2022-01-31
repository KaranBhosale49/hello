import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter marks in subject A :");
        int A=sc.nextInt();
        System.out.println("Enter marks in subject B :");
        int B=sc.nextInt();
        System.out.println("Enter marks in subject C :");
        int C=sc.nextInt();
        int t,T;
        T=A+B+C;
        t=A+B+C;
        t=t/3;
        System.out.println("Average Score : "+T);
        System.out.println("Average Percentage : "+t);
    }
}
