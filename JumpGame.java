public class JumpGame{
    public static int jump(int[] nums) {
        int n = nums.length;
        int jumps = 0;         
        int currentEnd = 0;    
        int farthest = 0;      
        for (int i = 0; i < n - 1; i++) {
            farthest = Math.max(farthest, i + nums[i]);
            if (i == currentEnd) {
                jumps++;            
                currentEnd = farthest; 
        if (currentEnd >= n - 1) {
                    break;
                }
            }
        }
        return jumps;
    }
       public static void main(String[] args) {
        int[] nums1 = {2, 3, 1, 1, 4};
        System.out.println(jump(nums1));  
        int[] nums2 = {2, 3, 0, 1, 4};
        System.out.println(jump(nums2));  
    }
}
