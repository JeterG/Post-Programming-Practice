public class has271{
    
    public static boolean has271(int[] nums){
        // Given an array of ints, return true if it contains a 2, 7, 1 pattern: a value, followed by the value plus 5, followed by the value minus 1. Additionally the 271 counts even if the "1" differs by 2 or less from the correct value.
        if(nums.length<=2){
            return false;
        }
        else{

            int temp=0;
            int diff=0;

            for (int i=0;i<nums.length-2;i++){
                temp=nums[i];
                if(nums[i+1]==(temp+5)){
                    diff=temp-1;
                    if((nums[i+2]==diff)||(nums[i+2]==diff-1)||(nums[i+2]==diff-2)||(nums[i+2]==diff+1)||(nums[i+2]==diff+2)){
                        return true;
                    }
                }
            }
            return false;

        }


    }
    
    public static void main(String[] args) {
        
    }
}