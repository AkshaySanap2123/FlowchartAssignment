import java.util.Arrays;


public class prnt2minimum 
{
    public static int printLargest(int arr[], int n)
    {
        Arrays.sort(arr);
        //1,2,3,4,5
        //0 1 2 3 4 index

        int second = 0;
        for(int i = 1; i < n-2 ; i++)
        {
            if(arr[i] != arr[n-2])
            {
                second = arr[i];   
                break;
            }
        }
        return second;
    }
    public static void main(String[] args) 
    {
        //int arr[] = { 8,15,3,18,19,26,17,36,83,85,5,4};
        int arr[] = { 1,2,3,4,5};
        int n = arr.length;

        System.out.println("Second minimum no: " +printLargest(arr, n)); 
    }
}

