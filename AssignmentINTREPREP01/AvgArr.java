public class AvgArr 
{
  
    static double avenger(int arr[], int n)
    {
        double sum = 0;

        for(int i = 0; i < n; i++)
        {
            sum = sum + arr[i];
        }
        return sum / n;
    }

    public static void main(String[] args) {
        
        int arr[] = { 1,2,3,4,5,6,7,8,9,10};
        int n = arr.length;

        System.out.println(avenger(arr, n));
    }
}
