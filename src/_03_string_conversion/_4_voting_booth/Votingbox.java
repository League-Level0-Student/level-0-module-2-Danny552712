package _03_string_conversion._4_voting_booth;

import javax.swing.JOptionPane;

public class Votingbox {

public static void main(String[] args) {

String ageAsString = JOptionPane.showInputDialog("How old are you?");

int ageAsInt = Integer.parseInt(ageAsString);

if(ageAsInt >= 18){
	JOptionPane.showInputDialog("Who should the next president be?");
}
else {
	JOptionPane.showMessageDialog(null, "You're to young to vote so no one cares about what you think.");
}

}}