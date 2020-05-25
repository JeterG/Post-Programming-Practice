public class Logic_2{

        public static boolean makeBricks(int small, int big, int goal){

            // We want to make a row of bricks that is goal inches long. We have a number of small bricks (1 inch each) and big bricks (5 inches each). Return true if it is possible to make the goal by choosing from the given bricks. This is a little harder than it looks and can be done without any loops. 

             if (small+5*big<goal){
                 return false;}
             if(goal%5<=small){
                 return true;
             }
             return false;
        }

        public static int lonesum(int a, int b, int c){

            // Given 3 int values, a b c, return their sum. However, if one of the values is the same as another of the values, it does not count towards the sum.
               if ((a==b) && (b==c)){
                   return 0;
               }
                if ((a==b) && (b!=c)){
                    return c;
                }
            if ((a==c) && (c!=b)){
                return b;
            }
            if ((b==c) && (a!=b)){
                return a;
            }
            return a+b+c;
        }

        public static int luckySum(int a, int b, int c){

        // Given 3 int values, a b c, return their sum. However, if one of the values is 13 then it does not count towards the sum and values to its right do not count. So for example, if b is 13, then both b and c do not count.
            if (a==13){
                return 0;
            }
            if (b==13){
                return a;
            }
            if(c==13){
                return a+b;
            }
            return a+b+c;
        }

     public static int no_teen_sum(int a, int b, int c){
        
// Given 3 int values, a b c, return their sum. However, if any of the values is a teen -- in the range 13..19 inclusive -- then that value counts as 0, except 15 and 16 do not count as a teens. Write a separate helper "public int fixTeen(int n) {"that takes in an int value and returns that value fixed for the teen rule. In this way, you avoid repeating the teen code 3 times (i.e. "decomposition"). Define the helper below and at the same indent level as the main noTeenSum().
        a=fix_teen(a);
        b=fix_teen(b);
        c=fix_teen(c);
        return a+b+c;
    }

    public static int fix_teen( int n){
            if (n==15 || n==16){ 
                return n;}
            if (13<=n&&n<=19){
                return 0;}
            return n;
    }

    public static int round_sum(int a, int b, int c){

// For this problem, we'll round an int value up to the next multiple of 10 if its rightmost digit is 5 or more, so 15 rounds up to 20. Alternately, round down to the previous multiple of 10 if its rightmost digit is less than 5, so 12 rounds down to 10. Given 3 ints, a b c, return the sum of their rounded values. To avoid code repetition, write a separate helper "public int round10(int num) {" and call it 3 times. Write the helper entirely below and at the same indent level as roundSum().


        a=round10(a);
        b=round10(b);
        c=round10(c);
        return a+b+c;}
    public static int  round10(int num){
    if (num%10<5){
        return num-num%10;}
    return num-num%10+10;}



        public static void main(String[] args) {

            System.out.println(makeBricks(0,0,0));
    }
}