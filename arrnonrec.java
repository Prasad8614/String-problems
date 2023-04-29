import java.util.Arrays;

// find first non recursive element in array
public class arrnonrec {
    public static void main(String[] args) {
        int arr[]={1,1,2,2,0,4,4};

        int res=0;
        for(int i:arr)
        {
            res ^= i;
        }

        System.out.println(res);
    }
}
