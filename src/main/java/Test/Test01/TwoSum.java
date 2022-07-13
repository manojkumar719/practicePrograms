package Test.Test01;

public class TwoSum {

	public int[] twoSum(int[] nums, int target) {
        int a[]=new int[2];
        for(int i=0;i<nums.length;i++) {
            for(int j=0;j<nums.length;j++)
                if(nums[i]+nums[j] == target)
                {
                    a[1]=i;
                    a[0]=j;
                    break;
                }
        }
        return a;
    }
	public static void main(String[] args) {
		int [] nums = {2,4,11,3};
		int target = 6;
		TwoSum t = new TwoSum();
		System.out.println(t.twoSum(nums, target)[0]+","+t.twoSum(nums, target)[1]);
	}

}
