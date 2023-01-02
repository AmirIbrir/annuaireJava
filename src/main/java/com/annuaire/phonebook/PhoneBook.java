package com.annuaire.phonebook;

import java.io.File;
import java.util.Scanner;

public class PhoneBook {

	public static Scanner sc = null;

	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		
//		String userlastName = getUserInput("Entrez un prenom: ");
//		String userFirstName = getUserInput("Entrez un nom: ");
//		String userPhoneNumber = getUserInput("Entrez un numero de tel: ");
//		
//		Contact newContact = new Contact(userlastName, userFirstName, userPhoneNumber);
//		
		/*
		 * System.out.println(userFirstName)
		System.out.println(userlastName);
		System.out.println(userPhoneNumber);
		*/
		//System.out.println(newContact.toString());

		File phoneBookFile = new File("/Users/amiroucheibrir/Documents/phonebook.txt");
		
		if (phoneBookFile.exists()) {
			System.out.println("Fichier existe");
		}else {
			System.out.println("Fichier n'existe pas");
		}
		
		sc.close();

	}
	public static String getUserInput(String userRequest) {
		
		System.out.println(userRequest);
		return sc.nextLine();
	}

}
