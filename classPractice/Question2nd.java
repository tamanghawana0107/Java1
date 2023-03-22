public class Question2nd {
    public static void main(String[] args)
    {
        int[] arr = {1,2,3,4,5};
        int result =0;
        for(int i =0 ; i<5; i++)
        {
            while(i<=5)
            {
                result = arr[i] + arr[i+1];
            }
        }
        System.out.println("The sum of the element is :" + result);

    }
}
