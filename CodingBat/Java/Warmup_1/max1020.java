public class max1020{
    
    public static int max1020(int a, int b){
        // Given 2 positive int values, return the larger value that is in the range 10..20 inclusive, or return 0 if neither is in that range.
        if (a>b){
            if((a>=10)&&(a<=20)){
                return a;
            }
            if((b>=10)&&(b<=20)){
                return b;
            }
            return 0;
        }
        if (b>a){
            if((b>=10)&&(b<=20)){
                return b;
            }
            if((a>=10)&&(a<=20)){
                return a;
            }
            return 0;
        }
        if((a>=10)&&(a<=20)){
            return a;
        }
        return 0;

    }
    
    public static void main(String[] args) {
        
    }
}