import java.util.Scanner;
public class nofooddevenindigit {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Long n=sc.nextLong();
        int f=sc.nextInt();
        int p=sc.nextInt();
        int fact=1;
        int count=0;
        int count1=0;
        Long rev=0L;
        Long temp=n;
        Long l=0L;
        long m=n;
        while(n!=0){
            Long digit=n%10;
            if(digit%2==0){
                count++;
            } else {
                count1++;
            }
            if(digit>l){
                l=digit;}
              if(digit<m){
                    m=digit;
                }
                
             rev=rev*10+digit;
            n=n/10;
            
        }
        for(int i=1;i<=f;i++){
                fact=fact*i;
            }
            int tmp=0;
            for(int j=1;j<p;j++){
                if(p%j==0){
                    tmp +=j;
                }
                
            }
            if (tmp==p) {
                    System.out.println("it prefect");
                    
                }
                else{
                    System.out.println("it not prefect");
                }
        System.out.println("Number of even digits: " + count);
        System.out.println("Number of odd digits: " + count1);
        System.out.println("Largest digit: " + l);
        System.out.println("Smallest digit: " + m);
        System.out.println("Reversed number: " + rev);
        System.out.println("Product of all digits: " +f+"is"+fact);
        if(rev==temp){
            System.out.println( " is a palindrome.");
        } else {
            System.out.println( " is not a palindrome.");
        }
    } 
}
