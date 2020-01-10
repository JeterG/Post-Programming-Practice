public class intMax{
    public static int intMax(int a, int b, int c){
        // Given three int values, a b c, return the largest.
        if(a>b){
            if (a>c){
                return a;
            }
            return c;
        }
        if(b>a){
            if (b>c){
                return b;
            }
            return c;
        }
        if (a==b){
            if (a>c){
                return a;
            }
            return c;
        }
        return a;
        
    }
    public static void main(String[] args) {
        
    }
}