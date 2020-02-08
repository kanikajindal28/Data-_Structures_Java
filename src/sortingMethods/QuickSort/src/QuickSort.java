import java.util.Scanner;
//TIME COMPLEXITY 0(nlogn) average case and O(n^2) worst case
//in place sorting algo. i.e. takes constant amount of memory
public class QuickSort {
    public static void main(String[] args) {
        QuickSort qs = new QuickSort();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size");
        int size=sc.nextInt();
        System.out.println("Enter the elements");
        int arr[]=new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        qs.quickSort(arr,0,arr.length-1);

        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }

    private void quickSort(int[] arr, int start, int end) {
        if(start<end) {
            int pivotIndex = partition(arr, start, end);
            quickSort(arr, start, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, end);
        }
    }

    private int partition(int[] arr, int start, int end) {
        int pivot=arr[end];
        int p_index = start;
        for(int i=start;i<end;i++)
        {
            if(arr[i]<pivot)
            {

                int temp2 = arr[i];
                arr[i]=arr[p_index];
                arr[p_index]=temp2;

                p_index++;

            }
        }
        int temp = arr[end];
        arr[end]=arr[p_index];
        arr[p_index]=temp;

        return p_index;
    }
}
