package Intro;

import java.util.Scanner;

public class Principal {
	 
	
    public static boolean isFibonacci(int number) {
        if (number == 0 || number == 1) {
            return true;
        }

        int first = 0, second = 1, next = 0;

        while (next < number) {
            next = first + second;
            first = second;
            second = next;
        }

        return next == number;
    }

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um número: ");
        int inputNumber = scanner.nextInt();
        
        if (isFibonacci(inputNumber)) {
            System.out.println("O número " + inputNumber + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + inputNumber + " NÃO pertence à sequência de Fibonacci.");
        }

        scanner.close();

	}

}
