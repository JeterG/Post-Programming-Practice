public class monkeyTrouble{
    // We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling. we are in trouble if they are both smiling or if none of them is smiling. Return true if we are in trouble.
    public static boolean monkeytrouble(boolean aSmile, boolean bSmile){
        if ((aSmile && bSmile)|| (!aSmile && !bSmile)){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        
    }
}