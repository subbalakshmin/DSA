import java.util.Scanner;
public class SecondLargestElementBetter {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int largest=arr[0];
        int slargest=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=largest && arr[i]<largest){
                slargest=arr[i];
            }
        }
        System.out.println(slargest);
    }
}
