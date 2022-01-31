public class Question2 {
    public static void main(String[] args) {
        for(int i=100;i<1000;i++){
            int j=i,a=0,t=0;
            while(j>0){
                a=j%10;
                j=j/10;
                t+=a*a*a;
            }
            if(t==i){
                System.out.println(t);
            }
        }
    }
}
