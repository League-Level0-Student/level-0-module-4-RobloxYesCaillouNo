
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

import javax.swing.JOptionPane;

public class SleepyHead {

	public static void main(String[] args) {

		boolean isWeekday, isVacation;

		/*
		 * Ask the user for these values using JOptionPane.showConfirmDialog(null, "is it a weekday?", "",
		 * JOptionPane.YES_NO_OPTION);
		 */
		int lol = JOptionPane.showConfirmDialog(null, "is it a weekday?", "",
				JOptionPane.YES_NO_CANCEL_OPTION);
		;
		/*
		 * 
		 * Print “sleep in” if it is a vacation or a weekend. If it’s a weekday, print “get up lazybones!” If it is a
		 * weekday, and we are on vacation, print “sleep in”.
		 */
		// VV no
		if (lol == 1) {
			System.out.println("sleep in");
		} else if (lol == 0) {
			int lel = JOptionPane.showConfirmDialog(null, "Is it a vacation or holiday?", "",
					JOptionPane.YES_NO_CANCEL_OPTION);
			if (lel == 0) {
				System.out.println("sleep in");
			} else if (lel == 1) {
				System.out.println("get up lazybonez!:P");
			}
		}

	}
}