import java.util.Arrays;
import java.util.Scanner;
public class LeftRotateTheArrayByOnePlace {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }   
        if(arr.length==0){
            System.out.println("array size is zero");
            return;
        }
        int temp=arr[0];
        for(int i=1;i<arr.length;i++){
            arr[i-1]=arr[i];
        }
        arr[arr.length-1]=temp;
        System.out.println(Arrays.toString(arr));

    }
   
}
