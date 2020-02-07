import java.util.Scanner;

//Selection sort minimises the number of swaps
//Time complexity O(n^2)
//space complexity O(1)
public class SelectionSort {
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
        int min_index;
        for(int i=0;i<size-1;i++)
        {
            min_index=i;
            for(int j=i+1;j<size;j++)
            {
                if(arr[j]<arr[min_index])
                {
                    min_index=j;
                }
            }
            if(i!=min_index)
            swap(arr,i,min_index);
        }
        System.out.println(" Elements after sorting \n");
        for(int i=0;i<size;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

    private static void swap(int[] arr, int i, int min_index) {
        int temp = arr[i];
        arr[i]=arr[min_index];
        arr[min_index]=temp;
    }
}
