public class IndexofFirstOccurence {
    static int BinarySearch(int[] arr, int x) {
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;

            if(arr[mid]<x)
                low=mid+1;

            else if(arr[mid]>x)
                high=mid-1;
            else
            if (mid == 0 || arr[mid - 1] != arr[mid]) // to find first occurrence we only see that if the previous one is not equal to mid.
                return (mid);
            else high = mid - 1;

        }

        return -1;
    }
    public static void main(String[] args) {
        int arr[]={10,20,30,40,40,50};
        int x=40;
        System.out.println(BinarySearch(arr,x));
    }
}
