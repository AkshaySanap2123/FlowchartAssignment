public class MissLamb
{
    public static int getMissing(int arr[], int n)
    {
        int total = 1; // 2, 3,

        for(int i=2; i < n; i++)
        {
            total = total + i;
                System.out.println("total " +total); // 3, 5, 7
            total = total - arr[i - 2];
                System.out.println("total " + total); // 2, 3, 4
        }
        return total;
    }

    public static void main(String[] args) {
        
        int[] arr = { 1,2,3,4,6};
        int n = arr.length;

        System.out.println(getMissing(arr, n));
    }

}