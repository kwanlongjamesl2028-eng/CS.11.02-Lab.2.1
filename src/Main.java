/**
*****************************************************************************************************
* By writing your name in the space provided below, you are honouring the CIS academic honesty pledge 
* “I have neither given nor received unauthorized aid on this piece of work.”
* NAME: 
*****************************************************************************************************
*/

public class Main {

    public static void main(String[] args) {
        int add = add(1,2);
        System.out.println(add);

        int add2 = add(1,2,3,4);
        System.out.println(add2);

        String morningGreeting = morningGreeting("Alice");
        System.out.println(morningGreeting);   

        String afternoonGreeting = afternoonGreeting("Bob");
        System.out.println(afternoonGreeting);

        String triple = triple("abc");
        System.out.println(triple);   

        int roundPositiveValueToNearestInteger = roundPositiveValueToNearestInteger(8.5);
        System.out.println(roundPositiveValueToNearestInteger);

        int roundNegativeValueToNearestInteger = roundNegativeValueToNearestInteger(-8.49);
        System.out.println(roundNegativeValueToNearestInteger);





        
    }

    // 1. add
    public static int add(int a, int b) {
        return a + b;
    }
    // 2. add
    public static int add(int a, int b, int c, int d) {
        return add(add(a,b), add(c,d));
    }
    // 3. morningGreeting
    public static String morningGreeting(String name) {
        return "早上好, " + name + "!";
    }
    // 4. afternoonGreeting
    public static String afternoonGreeting(String name) {
        return "下午好, " + name + "!";
    }
    // 5. triple
    public static String triple(String value) {
        return value + value + value;
    }
    // 6. half
    public static double half(double value){
        return value /2;
    }
    // 7. roundPositiveValueToNearestInteger
    public static int roundPositiveValueToNearestInteger(double value) {
        double d = value;
        int i = (int)(d + 0.5);
        return i;
    }
    // 8. roundNegativeValueToNearestInteger
     public static int roundNegativeValueToNearestInteger(double value) {
        double d = value;
        int i = (int)(d - 0.5);
        return i;
    }
}  


