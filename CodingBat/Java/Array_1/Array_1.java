import java.util.Arrays;

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
    public static int[] reverse3(int[] nums){
        // Given an array of ints length 3, return a new array with the elements in reverse order.
        return new int[] {nums[2], nums[1],nums[0]};
    }
    public static int[] maxEnd3(int[] nums){
        // Given an array of ints length 3, figure out which is larger, the first or last element in the array, and set all the other elements to be that value, return the changed array.
        if(nums[0]>nums[2]){
            return new int[] {nums[0], nums[0], nums[0]};
        }
        else if(nums[2]>nums[0]){
            return new int[] {nums[2], nums[2], nums[2]};
        }
        return new int[] {nums[0], nums[0], nums[0]};
    } 
    public static int sum2(int[] nums){
        // Given an array of ints, return the sum of hte first 2 elements in the array. If the array length is less than 2, just sum up the elements that exist, returning 0 if the array is length 0
        if (nums.length==0){
            return 0;
        }
        if (nums.length==1){
            return nums[0];
        }
        return nums[0]+nums[1];
    }
    public static int[] middleWay(int[] a, int[] b){
        // Given 2 int arrays, a and b, each length 3, return a new array length 2 containing their middle elements.
        return new int[]{a[1],b[1]};
    }
    public static int[] makeEnds(int[] nums){
        // Given an array of ints, return a new array length 2 containing the first and last elements from the original array. The original array will be length 1 or more.
        return new int[]{nums[0],nums[nums.length-1]};
    }
    public static boolean has23(int[] nums){
        // Given an int array length 2, return true if it contians a 2 or a 3.
        return (nums[0]==2)||(nums[0]==3)||(nums[1]==2)||(nums[1]==3);
    }
    public static boolean no23(int[] nums){
        // Given an int array length 2, return true if it does not contain a 2 or a 3.
        return (nums[0]!=2)&&(nums[0]!=3)&&(nums[1]!=2)&&(nums[1]!=3);
    }
    public static int[] makeLast(int[] nums){
        // Given an int array, return a new array with double the length where its last element is the same as the original array, and all the othe relements are 0. The original array will be leenght 1 or more. Note: by default all new int array contains all 0's;
        int[] f= new int[nums.length*2];
        f[f.length-1]=nums[nums.length-1];
        return f;

    }


    public static boolean double23(int[] nums) {
        // Given an int array, return true if the array contains 2 twice, or 3 twice. The array will be length 0, 1, or 2.
        if(nums.length<2){
                  return false;
              } 
              else{
                  if(nums[0]==nums[1]){
                      return (nums[0]==2||nums[0]==3);
                  }
                  return false;
              }
      }
      

    public static int[] fix23(int[] nums) {
        // Given an int array length 3, if there is a 2 in the array immediately followed by a 3, set the 3 element to 0. Return the changed array.
        for (int i=0; i<2;i++){
                  if((nums[i]==2)&&(nums[i+1]==3))
                  {
                      nums[i+1]=0;
                  }
              }
              return nums;
      }

    public static int start1(int[] a, int[] b) {
        // Start with 2 int arrays, a and b, of any length. Return how many of the arrays have 1 as their first element.
        if((a.length==0)&&(b.length==0))
                {
                    return 0;
                }
                else if(a.length==0){
                    if(b[0]==1){
                        return 1;
                    }
                    return 0;
                }
                else if(b.length==0){
                    if(a[0]==1){
                        return 1;
                    }
                    return 0;
                }
                else{
                    if((b[0]==1)&&(a[0]==1)){
                        return 2;
                    }
                    if((b[0]==1)||(a[0]==1)){
                        return 1;
                    }
                    return 0;
                }
        }

    public static int[] biggerTwo(int[] a, int[] b) {

    // Start with 2 int arrays, a and b, each length 2. Consider the sum of the values in each array. Return the array which has the largest sum. In event of a tie, return a.
        if((a[0]+a[1])>(b[0]+b[1])){
                  return a;
              }
              if((a[0]+a[1])<(b[0]+b[1])){
                  return b;
              }
              return a;
      }

    public static int[] makeMiddle(int[] nums) {
        // Given an array of ints of even length, return a new array length 2 containing the middle two elements from the original array. The original array will be length 2 or more.


        if(nums.length==2){
                  return nums;
              }
              return new int[] {nums[(nums.length/2)-1],nums[nums.length/2]};
      }
      
    
    public static int[] plusTwo(int[] a, int[] b) {
        // Given 2 int arrays, each length 2, return a new array length 4 containing all their elements.
        return new int[] {a[0],a[1],b[0],b[1]};
    }

    
    public static  int[] swapEnds(int[] nums) {

    // Given an array of ints, swap the first and last elements in the array. Return the modified array. The array length will be at least 1.
        if(nums.length==1){
                  return nums;
              }
              int temp=nums[0];
              nums[0]=nums[nums.length-1];
              nums[nums.length-1]=temp;
              return nums;
      }
      

    public static int[] midThree(int[] nums){

    // Given an array of ints of odd length, return a new array length 3 containing the elements from the middle of the array. The array length will be at least 3.

        if (nums.length==3){
            return nums;
        }
        int mid=(nums.length-1)/2;
        return new int[]{nums[mid-1],nums[mid],nums[mid+1]};
    }

    public static int maxTriple(int[] nums){
        // Given an array of ints of odd length, look at the first, last, and middle values in the array and return the largest. The array length   will be a least 1.
        int first=nums[0];
        int last=nums[nums.length-1];
        int mid=nums[(nums.length/2)];
        if (first>mid&&first>last){
            return first;
        }
        if (mid>first&&mid>last){
            return mid;
        }
            else{
                return last;
            }
    }

    public static int[] frontPiece(int[] nums) {
        // Given an int array of any length, return a new array of its first 2 elements. If the array is smaller than length 2, use whatever elemnts are present.
        if(nums.length<=2){
            return nums;
        }
        else{
            return new int[]{nums[0],nums[1]};
        }   
    }
    public static boolean unlucky1(int[] nums) {
        // We'll say that a 1 immediately followed by a 3 in an array is an "unlucky" 1. Return true if the given array contains an unlucky 1 in the first 2 or last 2 positions in the array.
        if(nums.length<=1){
            return false;
        }
        else if(nums[0]==1&&nums[1]==3){
            return true;
        }
        else if(nums[1]==1&&nums[2]==3){
            return true;
        }
        else if(nums[nums.length-1]==3&&nums[nums.length-2]==1){
            return true;
        }
        else{
            return false;
        }
        
    }
    public static int[] make2(int[] a,int[] b) {
        // Given 2 int arrays, a and b, return a new array lenght 2 containing, as much as will fit, the elements from a followed by the elements from b. The arrays may e any length, including 0, but there will be 2 or more elements available between the 2 arrays.
        if(a.length==0){
            return new int[] {b[0],b[1]};
        }
        else if(a.length==1){
            return new int[] {a[0],b[0]};
        }
        else if(a.length==2){
            return a;
        }
        else {
            return new int[] {a[0],a[1]};
        }
        
    }

    public static int[] front11(int[] a, int[] b) {
        // Given 2 int arrays, a and b, of any length, return a new array with the first element of each array. if either array is length 0, ignore that array.
        if(a.length==0&&b.length==0){
            return new int[]{};
        }
        else if(a.length==0){
            return new int[] {b[0]};
        }
        else if(b.length==0){
            return new int[] {a[0]};
        }
        else{
            return new int[] {a[0],b[0]};
        }
        
    }
    public static void main(String[] args) {
        int[] a= new int[]{1,2,3};
        System.out.println(firstLast6(a));
        System.out.println(sameFirstLast(a));
        System.out.println(Arrays.toString(makePi()));
        System.out.println(commonEnd(a,a));
        System.out.println(Arrays.toString(reverse3(a)));
        System.out.println(Arrays.toString(a));
        System.out.println(maxTriple(a));
    }
}