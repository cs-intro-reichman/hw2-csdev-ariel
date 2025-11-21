// feedback: very good!

public class Collatz {
	public static void main(String args[]) {
	    
        // inputs
        int N = Integer.parseInt(args[0]);
        String mode = args[1];

        for (int seed = 1; seed <= N; seed++) {
            int current_seed = seed;
            int count = 1;
        
        // mode v print first seed
        if (mode.equals("v")) {
            System.out.print(current_seed); }

        // Hailstone
        do {
        if (current_seed % 2 == 0) {
            current_seed /= 2; }
            else {
                current_seed = current_seed * 3 + 1;
            }
            count += 1;
            if (mode.equals("v")) {
                    System.out.print(" " + current_seed); }
        } while (current_seed != 1);

        if (mode.equals("v")) {
            System.out.println(" (" + count + ")"); }
        }
        
        // summary print that works for both modes
        System.out.println("Every one of the first " + N + " hailstone sequences reached 1.");
	}
}