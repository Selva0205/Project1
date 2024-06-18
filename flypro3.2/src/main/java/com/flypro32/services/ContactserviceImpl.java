package com.flypro32.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flypro32.entity.Contact;
import com.flypro32.repository.Contactrepository;
@Service
public class ContactserviceImpl implements Contactservice {
	@Autowired
	private Contactrepository contactrepo;

	@Override
	public void savecontactdata(Contact contact) {
		contactrepo.save(contact);
		

	}

	@Override
	public List<Contact> listAllContactData(Contact contact) {
		List<Contact> contacts = contactrepo.findAll();
		return contacts;
	}

}
