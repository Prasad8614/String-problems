import java.lang.reflect.Array;
import java.util.Arrays;


class sep
{
    public static void main(String[] args) {
        int arr[]={0,1,0,0,1,1,0,0,1,0};

        Arrays.sort(arr);

        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]);
        }
        
    }
}