import java.util.Arrays;

public class Logic_1{

    public static boolean cigarParty(int cigars, boolean isWeekend) {
    // When squirrels get together for a party, they like to have cigars. A squirrel party is successful when the number of cigars is between 40 and 60, inclusive. Unless it is the weekend, in which case there is no upper bound on the number of cigars. Return true if the party with the given values is successful, or false otherwise.
        if(!isWeekend){
            if(cigars>=40&&cigars<=60){
                return true;
            }
            else{
                return false;
            }
        }
        else if(cigars>=40){
            return true;
        }
        else{
            return false;
        }

        
    }
    
    public static void main(String[] args) {
        System.out.println("Test");
    }
}