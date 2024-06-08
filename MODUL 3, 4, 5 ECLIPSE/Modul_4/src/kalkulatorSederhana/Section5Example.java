package kalkulatorSederhana;
import java.util.Scanner; 

public class Section5Example{ 
    public static void main(String[] args){ 
        boolean quit = false; 
        int num1 = 0, num2 = 0, answer = 0; 
        char operand;
        Scanner in = new Scanner(System.in); 
        boolean isValid = false;
        do { 
        	System.out.print("Masukkan angka pertama : "); 
            num1 = in.nextInt(); 
            System.out.print("Masukkan angka kedua   : "); 
            num2 = in.nextInt();
            System.out.print("Masukan operator matematika : "); 
            String input = in.next(); 
            operand = input.charAt(0); 
            switch(operand) { 
                case '*': 
                    answer = num1 * num2; 
                    isValid = true;
                    break; 
                case '+': 
                    answer = num1 + num2; 
                    isValid = true;
                    break; 
                case '-': 
                    answer = num1 - num2;
                    isValid = true;
                    break;
                case '/': 
                    if (num2 != 0) {
                        answer = num1 / num2;
                        isValid = true;
                    } else {
                        System.out.println("Division by zero is not allowed.");
                        continue; // Skip the rest of the loop and ask for input again
                    }
                    break;
                default: 
                    System.out.println("Invalid input."); 
                    break; // Add a break statement here to exit the loop after invalid input
            } 
            
            // isValid bernilai true jika operand ditemukan
            if (isValid) { // Check if the input is valid before displaying the result
                System.out.println("Result: " + answer);
            }
            
            
            System.out.println("Quit? Y/N"); 
            if (in.next().equalsIgnoreCase("Y")) 
                quit = true; 
        } 
        while(!quit); 
        System.out.println("Finish");
    } 
}
