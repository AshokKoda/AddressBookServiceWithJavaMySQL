package com.bridgelabz.addressbook;

public class AddressBookMain {

	public static void main(String[] args) {
		System.out.println("**************** Welcome to Address Book Service ****************");
		//AddressBookDBService addressBookDBService = new AddressBookDBService();
		//addressBookDBService.getConnection();
		
		AddressBookService addressBookService = new AddressBookService();
		System.out.println("<---------------- Fetch Contacts List ---------------->");
		addressBookService.getAllContactsData();
		
	}
}
