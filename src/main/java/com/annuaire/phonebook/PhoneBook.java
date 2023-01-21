package com.annuaire.phonebook;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

public class PhoneBook {

	public static final String PHONE_BOOK_FILE_PATH = "/Users/amiroucheibrir/Documents/phonebook.txt";
	public static Scanner sc = null;

	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		
		String userlastName = getUserInput("Entrez un prenom: ");
		String userFirstName = getUserInput("Entrez un nom: ");
		String userPhoneNumber = getUserInput("Entrez un numero de tel: ");
		
		Contact newContact = new Contact(userlastName, userFirstName, userPhoneNumber);
		
		/*
		 * System.out.println(userFirstName)
		System.out.println(userlastName);
		System.out.println(userPhoneNumber);
		*/
		System.out.println(newContact.toString());
		
		File phoneBookFile = getOrCreatePhoneBookFile(PHONE_BOOK_FILE_PATH);

		
		appendContactToPhoneBook(phoneBookFile, newContact);
		
		
		sc.close();

	}
	public static String getUserInput(String userRequest) {
		
		System.out.println(userRequest);
		return sc.nextLine();
	}
	
	public static File getOrCreatePhoneBookFile(String phoneBookFilePath) {
		File phoneBookFile = new File(phoneBookFilePath);
		
		if (phoneBookFile.exists()) {
			return phoneBookFile;
		}
			System.out.println("Fichier n'existe pas(" + phoneBookFilePath + ")");
			try {
				phoneBookFile.createNewFile();
				System.out.println("Le fichier a été crée(" + phoneBookFilePath + ")");
				return phoneBookFile;
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		return null;
		
	}
	
	public static void appendContactToPhoneBook(File phoneBookFile, Contact newContact) {
		try(BufferedWriter fileWriter = new BufferedWriter(new FileWriter(phoneBookFile, true))){
			
			fileWriter.append(newContact.toString() + '\n');
			System.out.println("Contact ajouté");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
