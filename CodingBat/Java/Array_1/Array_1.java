public class Array_1{
    public static boolean firstLast6(int[] nums) {
        // Given an array of ints, return true if 6 appears as either the first or last element in the array. The array will be length 1 or more.
        if(nums.length==1){
            return (nums[0]==6);
        }
        return((nums[0]==6)||(nums[nums.length-1]==6));

    }
    public static boolean sameFirstLast(int[] nums){
        // Given an array of ints, return true if the array length is 1 or more, and the first element and the last element are equal
        if(nums.length<1){
            return false;
        }
        return (nums[0]==nums[nums.length-1]);
    }
    public static void main(String[] args) {
        int[] a= new int[]{1,2,1};
        System.out.println(firstLast6(a));
        System.out.println(sameFirstLast(a));
    }
}