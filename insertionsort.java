import java.util.Arrays;

/**
 * insertionsort
 */
public class insertionsort {
    public static void main(String[] args) {
        int[] arr= {-84,54,-9 };
        System.out.println(Arrays.toString(insertion(arr)));
    }

    public static int[] insertion (int[] arr){
        int temp;
        int j;
        for (int i = 0; i <= arr.length -2 ; i++) {
            j=i+1;
            while (j <= i + 1) {
                if (j>=1 && arr[j]<arr[j-1]){
                    temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    j--;
                }
                else {
                    break;
                }
            }
        }
        return arr;
    }
}