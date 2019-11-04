public class sleepIn{
    public static  boolean sleepIn(boolean weekday,boolean vacation){
        // The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation. We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.
        if (weekday && vacation){
            return true;

        }
        else if (weekday){
            return false;
        }

        return true;
    }
    public static void main(String[] args) {
        sleepIn(true,false);
    }
}