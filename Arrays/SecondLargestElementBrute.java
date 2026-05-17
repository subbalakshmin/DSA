import java.util.Arrays;
import java.util.Scanner;
public class SecondLargestElementBrute {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int slargest=-1;
        for(int i=0;i<arr.length;i++){
            Arrays.sort(arr);
        }
        int largest=arr[n-1];
        for(int i=n-2;i>0;i--){
            if(arr[i]!=largest){
                slargest=arr[i];
                break;
            }
        }
        System.out.println(slargest);
    }
}
