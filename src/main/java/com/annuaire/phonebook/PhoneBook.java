package com.annuaire.phonebook;

import java.util.Scanner;

public class PhoneBook {

	public static Scanner sc = null;

	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		
		String userlastName = getUserInput("Entrez un prenom: ");
		String userFirstName = getUserInput("Entrez un nom: ");
		String userPhoneNumber = getUserInput("Entrez un numero de tel: ");
		
		System.out.println(userFirstName);
		System.out.println(userlastName);
		System.out.println(userPhoneNumber);

		sc.close();

	}
	public static String getUserInput(String userRequest) {
		
		System.out.println(userRequest);
		return sc.nextLine();
	}

}
