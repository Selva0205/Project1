package com.flypro32.services;

import java.util.List;

import com.flypro32.entity.Contact;

public interface Contactservice {
	
	public void savecontactdata(Contact contact);
	public List<Contact> listAllContactData(Contact contact);

}
