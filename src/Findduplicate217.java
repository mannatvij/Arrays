import java.util.Arrays;

public class Findduplicate217 {
    //leetcode 217
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=0; i< nums.length-1; i++){
            if(nums[i]== nums[i+1]){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Findduplicate217 f = new Findduplicate217();
        System.out.println(f.containsDuplicate(new int[]{1,2,3,4,5,6,7,8,9}));
    }
}
