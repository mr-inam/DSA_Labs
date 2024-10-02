public class Q1{
    public static int binary(int arr[], int key, int left, int right){
        if(left > right) return -1;
        int mid = left + (right-left)/2;
        if(arr[mid] == key) return mid;
        if(key < arr[mid]){
            return binary(arr, key, left, mid);
        } else
            return binary(arr, key, mid+1, right);
    }
    public static void main(String[] args) {
        int arr[] = {7,4,2,5,9,3,1,6};
        System.out.println("search 5: index-"+binary(arr,5,0,arr.length-1));
    }
}