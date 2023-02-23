import java.util.Arrays;

public class prnt2Largest 
{
    public static int printLargest(int arr[], int n)
    {
        Arrays.sort(arr);
        

        int second = 0;
        for(int i = n-2; i >= 0 ; i--)
        {
            if(arr[i] != arr[n-1])
            {
                second = arr[i];
                
                break;
            }
        }
        return second;
    }
    public static void main(String[] args) 
    {
        int arr[] = { 8,15,3,18,19,26,17,36,83,85};
        int n = arr.length;

        System.out.println("Second largest no: " +printLargest(arr, n)); 
    }
}
