public class BinarySearchIterative {
    static int BinarySearch(int arr[], int x){
        int n=arr.length;
        int low=0;
        int high= n-1;
        while(low<=high){
            int mid= (low+high)/2;
                if(arr[mid]==x){
                    return mid;
                }
                if(arr[mid]>x){
                    high= mid-1;
                }
                else{
                    low= mid+1;
                }
            }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]= {10,20,30,40,50,90};
        System.out.println(BinarySearch(arr,20));
    }
}
