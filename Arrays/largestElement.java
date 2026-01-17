public class largestElement {
    public static int largest(int[] nums){
        int max = nums[0];
        for(int i = 0; i<nums.length; i++){
            if(nums[i]>max){
                max = nums[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {10, 324, 45, 90, 9808};
         System.out.println(largest(arr));
         
    }
    
}
