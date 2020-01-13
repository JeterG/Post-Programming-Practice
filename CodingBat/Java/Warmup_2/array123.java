public class array123{
    
    public static boolean array123(int[] nums){
        // Given an array of ints, return true if the sequence of numbers 1, 2, 3 appears in the array somewhere.
        int amount = nums.length;
        for (int i=0;i<amount-2;i++){
            if((nums[i]==1)&&(nums[i+1]==2)&&(nums[i+2]==3)){
                return true;
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
        
    }
}