import java.util.Objects;
import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String username="Karan",u1;
        int pass=1234,p,i=0;
         for(i=0;i<3;i++){
            System.out.println("Enter username ");
            u1=sc.next();
            System.out.println("Enter password ");
            p=sc.nextInt();
            if((Objects.equals(u1, username))&&(p==pass)) {
                System.out.println(" Welcome " + username);
              i=i+3;
            }
        }
        if (i==3){
            System.out.println("Contact Admin");
        }


    }
}
