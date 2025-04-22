package pack;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10; // Number of Fibonacci numbers to display
        int first = 0, second = 1;

        System.out.println("First " + n + " Fibonacci numbers:");
        
        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");
            
            // Compute the next Fibonacci number
            int next = first + second;
            first = second;
            second = next;
        }

	}

}
