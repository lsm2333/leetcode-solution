package simon.leetcode.p1;
/**
 * https://leetcode-cn.com/problems/two-sum/description/
 * @author lsm2333
 *
 */
public class TwoSum {
	public static void main(String[] args){
		SolutionP1.twoSum(new int[]{1,2,3,4},4);
	}
}

class SolutionP1 {
    public static int[] twoSum(int[] nums, int target) {
        for(int x=0;x<nums.length-1;x++){
            for(int y=x+1;y<nums.length;y++){
                if(nums[x]+nums[y]==target){
                	System.out.printf("x:%d,y:%d%n",x,y);
                    return new int[]{x,y};
                }
            }
        }
        return null;
    }
   
}