import java.util.Scanner;

public class paa {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            } char ch='A';
            for(int k=1;k<=(2*i-1)/2+1;k++){
                System.out.print(ch);
                ch++;
            }
            ch-=2;
             for(int l=1;l<=i-1;l++){
                System.out.print(ch);
                ch--;
            }
            System.out.println();
        }
        
    }
    
}
