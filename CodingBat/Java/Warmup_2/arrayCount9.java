public class arrayCount9{
    
    public static int arrayCount9(int[] nums){
        // Given an array of ints, return the number of 9's in the array.
        if(nums.length==0){
            return 0;
        }
        else{
            int count=0;
            for (int i=0;i<nums.length;i++){
                if(nums[i]==9){
                    count++;
                }
            }
            return count;
        }
    }
    
    public static void main(String[] args) {
        
    }
}