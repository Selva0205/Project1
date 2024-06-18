package com.flypro32.services;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flypro32.entity.Lead;
import com.flypro32.repository.Leadrepository;
@Service
public class LeadserviceImpl implements Leadservice {
	
	@Autowired
	private Leadrepository leadrepo;

	@Override
	public void saveleaddata(Lead lead) {
		leadrepo.save(lead);
		

	}

	@Override
	public void deleteonelead(long id) {
		leadrepo.deleteById(id);
		
	}

	@Override
	public List<Lead> listAllLeadData(Lead lead) {
		List<Lead> leads=leadrepo.findAll();
		return leads;
	}

	

	

	
		
	}


