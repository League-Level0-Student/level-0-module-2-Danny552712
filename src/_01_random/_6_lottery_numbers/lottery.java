package _01_random._6_lottery_numbers;

import java.util.Random;

import javax.swing.JOptionPane;

public class lottery {
	public static void main(String[] args) {
	Random random1 = new Random();
	int number1 = random1.nextInt(100);
	int number2 = random1.nextInt(100);
	int number3 = random1.nextInt(100);
	int number4 = random1.nextInt(100);
	int number5 = random1.nextInt(100);
	int number6 = random1.nextInt(100);
		JOptionPane.showMessageDialog(null, number1 + " " + number2 + " " + number3 + " " + number4 + " " + number5 + " " + number6);
	}
}
