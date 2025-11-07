public class Max {
    public static void main(String[] args) 
    {
        int arr[]= {2,234,3,321,23,4,42};
        int max1,max2;
        max1=max2 = arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i] > max1)
            {
                max2=max1;
                max1 = arr[i];
            }
            else if(arr[i] > max2)
            {
                max2=arr[i];
            }

        }
        System.out.println("Max num is : " +max1);
        System.out.println("Max num is : " +max2);
    }
}
