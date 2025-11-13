public class CalcPi {
	public static void main(String [] args) { 

        // define variables
	    int variableCount = Integer.parseInt(args[0]);
        int n = 1;
        int countRunTimes = 0;
        double result = 0.0;
        double mone = 1.0;

        // while for the formula
        while (countRunTimes < variableCount && variableCount > 0) {
        result += mone * (1.0/n);
        n += 2;
        mone = -mone;
        countRunTimes += 1; }

        double pi = 4 * result;
        
        // print results of pi
        System.out.println("pi according to Java: " + Math.PI);
        System.out.println("pi, approximated:     " + pi);
	}
}