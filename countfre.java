import java.util.Scanner;
public class countfre {
    public static void main(String[] args0){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]==arr[0]){
                count++;
            }
        }
        System.out.println("The frequency of the first element is: " + count);
    }
}
