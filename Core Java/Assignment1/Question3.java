import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int S1=0,S2=0,S3=0;
        System.out.println("enter marks for sub1: ");
        S1= sc.nextInt();
        System.out.println("enter marks for sub1: ");
        S2= sc.nextInt();
        System.out.println("enter marks for sub1: ");
        S3= sc.nextInt();
        if((S1 >= 60) && (S2 >= 60) && (S3 >= 60)) {
            System.out.println("Passed");
        }
        if((S1 >= 60 && S2 >= 60 && S3 < 60)||(S1 >= 60 && S2< 60 && S3 >=60)||(S1 < 60 && S2 >= 60 && S3 < 60)){
            System.out.println("Promoted");
        }
        if((S1 >= 60 && S2 < 60 && S3 < 60)||(S1 < 60 && S2>= 60 && S3 <60)||(S1 < 60 && S2 < 60 && S3 >= 60)||(S1<60 && S2<60 && S3<60)){
            System.out.println("failed");
        }
    }
}
