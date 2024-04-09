import java.util.Arrays;
public class cyclesort {
    public static void main(String[] args) {
        int[] arr= {};
        System.out.println(Arrays.toString(cycle(arr)));
    }

    public static int[] cycle (int[] arr){
        int i = 0;
        int item;
        while (i< arr.length) {
            if (arr[i]!=i+1){
                item=arr[arr[i]-1];
                arr[arr[i]-1]=arr[i];
                arr[i]=item;
            }
            else {
                i++;
            }
        }
            return arr;
        }
    }
