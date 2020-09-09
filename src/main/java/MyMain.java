import java.util.Scanner;

public class MyMain {

    // Calculates the median of the three inputs
    public static int median(int a, int b, int c) {
        if (((a>=b)&&(b>=c))||((c>=b)&&(b>=a))) return b;
        else if (((b>=a)&&(a>=c))||((c>=a)&&(a>=b))) return a;
        else return c;
        //usage of Math. methods: (replaced by shorter code)
        //if ((Math.max(a, Math.max(b, c)) != b)&&(Math.min(a, Math.min(b, c)) != b)) return b;
    }

    // Returns the input with the larger absolute value
    public static int magnitude(int a, int b) {
        if (Math.abs(a)>= Math.abs(b)) return a;
        else return b;
    }

    // Returns the "c" value from the Pythagorean theorem "a^2 + b^2 = c^2",
    // where "a" and "b" are the inputs to the method
    public static double pythagoras(int a, int b) {
        return Math.sqrt((Math.pow(a,2))+Math.pow(b,2));
    }

    public static void main(String[] args) {       
        Scanner scan = new Scanner(System.in);
        System.out.println("The available functions are median, magnitude, and pythagoras. Which function would you like to run?");
        String function = scan.next();
        if (function.equals("median")) {
        System.out.println("For median, enter 3 values: ");
        System.out.println("Answer: "+median(scan.nextInt(), scan.nextInt(), scan.nextInt()));
        }
        else if (function.equals("magnitude")) {
        System.out.println("For magnitude, enter 2 values: ");
        System.out.println("Answer: "+magnitude(scan.nextInt(), scan.nextInt()));
        }
        else if (function.equals("pythagoras")) {
        System.out.println("For pythagoras, enter 2 values: ");
        System.out.println("Answer: "+pythagoras(scan.nextInt(), scan.nextInt()));
        }
        else System.out.println("Error: command not understood. Please run again.");
        scan.close();

    }
}
