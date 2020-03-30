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
    
    public static int dateFashion(int you, int date) {
        // You and your date are trying to get a table at a restaurant. The parameter "you" is the stylishness of your clothes, in the range 0..10, and "date" is the stylishness of your date's clothes. The result getting the table is encoded as an int value with 0=no, 1=maybe, 2=yes. If either of you is very stylish, 8 or more, then the result is 2 (yes). With the exception that if either of you has style of 2 or less, then the result is 0 (no). Otherwise the result is 1 (maybe).
        if (you>=8){
            if (date<=2){
                return 0;
            }
            return 2;
        }
        else if (date>=8){
            if (you<=2){
                return 0;
            }
            return 2;
        }
        else if(you<=2||date<=2){
            return 0;
        }
        else{
            return 1;
        }
    }

    public static boolean squirrelPlay(int temp, boolean isSummer){
        // The squirrels in Palo Alto spend most of the day playing. In particular, they play if the temperature is between 60 and 90 (inclusive). Unless it is summer, then the upper limit is 100 instead of 90. Given an int temperature and a boolean isSummer, return true if the squirrels play and false otherwise.
        if(!isSummer){
            return (temp>=60&&temp<=90);
        }
        else{
            return (temp>=60&&temp<=100);
        }
    }

    public static int caughtSpeeding(int speed, boolean isBirthday){

        // You are driving a little too fast, and a police officer stops you. Write code to compute the result, encoded as an int value: 0=no ticket, 1=small ticket, 2=big ticket. If speed is 60 or less, the result is 0. If speed is between 61 and 80 inclusive, the result is 1. If speed is 81 or more, the result is 2. Unless it is your birthday -- on that day, your speed can be 5 higher in all cases.

        if(isBirthday){
            speed=speed-5;
        }
        if(speed<=60){
            return 0;
        }
        else if(speed>=61&&speed<=80){
            return 1;
        }
        else{
            return 2;
        }
    }

    public static int sortaSum(int a, int b){
        // Given 2 ints, a and b, return their sum. However, sums in the range 10..19 inclusive, are forbidden, so in this case just return 20.
        int sum=a+b;
        if(sum>=10&&sum<=19){
            return 20;
        }
        return sum;
    }

    public static String alarmClock(int day, boolean vacation){

        // Given a day of the week encoded as 0=Sun, 1=Mon, 2=Tue, ...6=Sat, and a boolean indicating if we are on vacation, return a string of the form "7:00" indicating when the alarm clock should ring. Weekdays, the alarm should be "7:00" and on the weekend it should be "10:00". Unless we are on vacation -- then on weekdays it should be "10:00" and weekends it should be "off".

        if(!vacation){
            if(day>=1&&day<=5){
                return "7:00";
            }
            return "10:00";
        }
        if(day>=1&&day<=5){
            return "10:00";
        }
        return "off";

    }

    public static boolean love6(int a, int b){
        // The number 6 is a truly great number. Given two int values, a and b, return true if either one is 6. Or if their sum or difference is 6. Note: the function Math.abs(num) computes the absolute value of a number.
        if(a==6||b==6){
            return true;
        }
        else if(Math.abs(a-b)==6){
            return true;
        }
        return (a+b==6);
    }
    public static void main(String[] args) {
        System.out.println("Test");
    }
}