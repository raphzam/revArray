public class Main {
    public static void main(String[] args){

        int[] arr = {1,2,3,4};
        reverseArray(arr);

        for(int x : arr){
            System.out.print(x + ", ");
        }

    }

    public static int[] reverseArray(int[] arr){
        int temp;

        for (int i=0, j = arr.length-1; i < j; i++, j--){
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        return arr;
    }
}
