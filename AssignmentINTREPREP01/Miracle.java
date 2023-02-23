
public class Miracle 
{
    //super cool
    /*
    public static int getSecondMinimum(int arr[])
    {
        Arrays.sort(arr);

        return arr[1];
    }
    */

    public static int getSecondMinimum2(int arr[], int n)
    {
        int temp;

        for(int i=0; i < n; i++)
        {
            for(int j=i+1; j < n; j++)
            {
                if (arr[i] > arr[j])
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            
        }
        return arr[1];
    }
    public static void main(String[] args) 
    {
        int arr[] = { 36,85,63,97,24,66,8,11,9};
       // System.out.println("second minimum no: " +getSecondMinimum(arr));
       int n = arr.length;
        System.out.println("second minimum no: " +getSecondMinimum2(arr, n));
        
    }
    
}
