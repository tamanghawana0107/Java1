
public class Question2 {
    public static void main(String[] args)
    {
        int[] arr = {1,2,3,4,5};
        int result[] = new int[5];
        for(int i =0 ; i<arr.length; i++)
        {
            while(i<arr.length)
            {
                result[0] = arr[i]++;
            }
        }
        System.out.println("The sum of the element is :" + result[0]);

    }
}
