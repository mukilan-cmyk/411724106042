import java.util.Scanner;

public class math {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt(); 
        System.out.println(Math.sqrt(a));    // 5.0
        System.out.println(Math.pow(a,b));   // 8.0
        System.out.println(Math.abs(b));    // 10
        System.out.println(Math.max(a,b));   // 8
        System.out.println(Math.min(a,b));   // 5
        System.out.println(Math.ceil(a));   // 5.0
        System.out.println(Math.floor(a));  // 4.0
        System.out.println(Math.round(a));  // 5 
    } 
}
    