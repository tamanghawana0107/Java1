public class exam{
    public static void main(String[] args)
    {
        int[] arr = {1,2,3,4,5};
        for(int i=0; i<arr.length; i++)
        {
            if(i==2)
            {
                continue;
            }
            System.out.println(arr[i] + " ");
        }
    }
}