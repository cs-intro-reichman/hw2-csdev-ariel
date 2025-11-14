public class TestRandom {
	public static void main(String[] args) {
	    
        int runTime = Integer.parseInt(args[0]);
        int N = 0;
        int high = 0;
        int low = 0;

        while (runTime > 0 && N < runTime) {
        double random = Math.random();
        if (random > 0.5) {
            high += 1;
        }
        else {
            low += 1;
        }
        N = N + 1; }

        System.out.println("> 0.5:  " + high + " times");
        System.out.println("<= 0.5: " + low + " times");
        double ratio = (double) high / low;
        System.out.println("Ratio: " + ratio);
	}
}