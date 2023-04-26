package practice_3;

public class palinDrome {


    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,4,3,2,1,0};
        boolean isPlaindrome = false;
        for(int i=0, j=arr.length-1; i<=j; i++, j--){
            if(arr[i] == arr[j]){
                isPlaindrome = true;
                break;
            }
        }

        System.out.println("The array is palindrome: "+isPlaindrome);

    }
}
