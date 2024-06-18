package com.flypro32.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flypro32.entity.Lead;
import com.flypro32.repository.Leadrepository;
@RequestMapping("/api")
@RestController
public class Leadrestcontroller {
	@Autowired
	private Leadrepository leadrepo;
	
	@GetMapping
	public List<Lead> getallApi()
	{
		List<Lead> leads=leadrepo.findAll();
		return leads;
	}
	@PostMapping
	public void saveapi(@RequestBody Lead lead)
	{
		leadrepo.save(lead);
	}
	
	@PutMapping
	public void updateapi(@RequestBody Lead lead)
	{
		leadrepo.save(lead);
	}
	@DeleteMapping
	public void deleteapi(@PathVariable ("id") long id)
	{
		leadrepo.deleteById(id);
	}
	

}
