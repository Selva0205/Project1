package com.flypro32.services;

import java.util.List;

import com.flypro32.entity.Lead;


public interface Leadservice {
	
	public void saveleaddata(Lead lead);
	public void deleteonelead(long id);
	public List<Lead> listAllLeadData(Lead lead);
	
	

}
