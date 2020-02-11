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
    public static int[] makePi(){
        return new int[] {3,1,4};
    }
    public static boolean commonEnd(int[] a, int[] b){
    // Given 2 arrays of ints, a and b, return true if they have the same first element or they have the same last element. Both arrays will be length 1 or more.
    // return (a[0]==b[0]) or (a[a.length-1]==b[b.length-1]);
        if (a[0]==b[0]){
            return true;
        }
        else if(a[a.length-1]==b[b.length-1]){
            return true;
        }
        return false;
    }
    public static int sum3(int[] nums){
        // Given an arrya of ints length 3, return the sum of all the elements.
        return nums[0]+nums[1]+nums[2];
    }
    public static int[] rotateLeft3(int[]nums){
        // Given an array of ints lenght 3 return an arry with the elements "rotated left" so {1,2,3} yields {2,3,1}
        return new int [] {nums[1],nums[2],nums[0]};
    }
    public static void main(String[] args) {
        int[] a= new int[]{1,2,1};
        System.out.println(firstLast6(a));
        System.out.println(sameFirstLast(a));
        System.out.println(makePi());
        System.out.println(commonEnd(a,a));
    }
}