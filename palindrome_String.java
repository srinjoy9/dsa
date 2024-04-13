import java.util.Scanner;
public class palindrome_String {
    
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        str=str.toLowerCase();
        int start=0;
        char[] arr=str.toCharArray();
        int end=arr.length-1;
        
        while (start<end) {
            if (arr[start]!=arr[end]){
                break;
            }
            else {
                start++;
                end--;
            }
        }
        System.out.println(start==end);
        in.close();
    }
}
