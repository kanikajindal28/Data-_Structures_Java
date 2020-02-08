import java.util.Scanner;
//TIME COMPLEXITY O(m logn)
//SPACE COMPLEXITY O(n)
public class MergeSort {

    public static void main(String[] args) {
        MergeSort ms = new MergeSort();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size");
        int size=sc.nextInt();
        System.out.println("Enter the elements");
        int arr[]=new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        ms.merge_sort(arr,0,arr.length-1);
        for(int i=0;i<size;i++)
            System.out.println(arr[i]);

    }

    private void merge_sort(int[] arr, int left_index, int right_index) {
        if(left_index<right_index)
        {
            int mid = (left_index+right_index)/2;
            merge_sort(arr,left_index,mid);
            merge_sort(arr,mid+1,right_index);
            merge(arr,left_index,mid,right_index);
        }


    }

    private void merge(int[] arr, int left_index, int mid, int right_index) {
        int n1 = mid-left_index+1;
        int n2 = right_index-mid;
        int left[] = new int[n1];
        int right[] = new int[n2];
        for(int i=0;i<n1;i++)
            left[i]=arr[left_index+i];
        for(int i=0;i<n2;i++)
            right[i]=arr[mid+i+1];

        int i=0,j=0,k=left_index;
        while (i<n1 && j<n2)
        {
            if(left[i]<=right[j])
            arr[k++]=left[i++];
            else
                arr[k++]=right[j++];
        }
        while (i < n1)
        {
            arr[k] = left[i];
            i++;
            k++;
        }
        while (j < n2)
        {
            arr[k] = right[j];
            j++;
            k++;
        }
    }
}
