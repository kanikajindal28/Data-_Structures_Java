import java.util.Scanner;

//Best cASE O(n) worst case O(n^2) TIMECOMPLEXITY
//SPACE COMPLEXITY O(1)
//works efficiently where only one or two elements are unsorted;
public class InsertionSort
{
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
        int j,value;
        for(int i=0;i<size;i++)
        {
            j=i-1;
            value=arr[i];
            while(j>=0 && arr[j]>value)
            {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=value;
        }
        for(int i=0;i<size;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
