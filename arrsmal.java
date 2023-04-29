import java.util.Arrays;

// find second smallest from an array
public class arrsmal {
    public static void main(String[] args) {
        int arr[]={10,5,3,1,8,7};

        Arrays.sort(arr);

        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]);
        }
        System.out.println();
        System.out.println("second smallest no. is :"+arr[1]);
    }
    
}
