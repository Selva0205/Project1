package com.flypro32.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.flypro32.entity.Billing;
import com.flypro32.entity.Contact;
import com.flypro32.entity.Lead;
import com.flypro32.services.BillingService;
import com.flypro32.services.Contactservice;
import com.flypro32.services.Leadservice;
import com.flypro32.utility.FlyproEmail;

@Controller
public class Leadcontroller {
	@Autowired
	private Leadservice leadserv;
	
	@Autowired
	private Contactservice contactserv;
	@Autowired
	private FlyproEmail flyproemail;
	@Autowired
	private BillingService billserv;
	
	//http://localhost:8080/lead
	@RequestMapping("/lead")
	public String show()
	{
		return "lead";
	}
	@RequestMapping("/savelead")
	public String savelead(Lead lead,ModelMap model)
	{
		leadserv.saveleaddata(lead);
		flyproemail.sendFlypromail(lead.getEmailId(),"Welcome to DAC Developers", "congratulations-You flat are now booking");
		model.addAttribute("lead", lead);
		return "leadinfo";
	}
	
	@RequestMapping("/savecontact")
	public String savecontact(Contact contact,@RequestParam("id") long id)
	{
		contactserv.savecontactdata(contact);
		leadserv.deleteonelead(id);
		return "billing";
	}
	
	@RequestMapping("/savebill")
	public String SaveBill(Billing bills,ModelMap model)
	{
		billserv.savebillData(bills);
		model.addAttribute("bills", bills);
		return "lead";
	}
	//http://localhost:8080/listall
	@RequestMapping("/listall")
	public String listAllLeads(Lead lead,Model model) {
		List<Lead> leads=leadserv.listAllLeadData(lead);
		model.addAttribute("leads", leads);
		return "list_all";
		
	}
	//http://localhost:8080/listcontact
	@RequestMapping("/listcontact")
	public String listAllContact(Contact contact,Model model)
	{ 
		List<Contact> contacts = contactserv.listAllContactData(contact);
		model.addAttribute("contacts", contacts);
		return "list_contact";
	}
	
	

}
