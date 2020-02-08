import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Enter the element to be searched.");
        int ele = sc.nextInt();
        int loc = binarySearch(arr,ele);
        if(loc== -1)
            System.out.println("Element not found");
        else
            System.out.println("Element found at " + loc+"rd Index");

    }

    private static int binarySearch(int[] arr,int element) {
        int left = 0;
        int right = arr.length-1;
        int mid;
        while(left <= right)
        {
         mid = (left+right)/2;
         if(arr[mid]==element)
             return mid;
         else if(arr[mid]<element)
         {
             left=mid+1;
         }
         else
             right = mid-1;
        }
        return -1;
    }
}
