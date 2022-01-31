import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        System.out.println("Enter your Income in CTC");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if (n==0 && n<=180000){
            System.out.println("No Payable Tax");
        }
        if(n>180000 && n<=300000){
            System.out.println("Tax Payable is 10%");
            n=n*10/100;
            System.out.println("Tax amount to pay : "+n);
        }
        if(n>300000 && n<=500000){
            System.out.println("Tax Payable is 20%");
            n=n*20/100;
            System.out.println("Tax amount to pay : "+n);
        }
        if(n>500000 && n<=1000000){
            System.out.println("Tax Payable is 30%");
            n=n*30/100;
            System.out.println("Tax amount to pay : "+n);
        }
    }
}
