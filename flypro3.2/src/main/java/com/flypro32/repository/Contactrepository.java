package com.flypro32.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flypro32.entity.Contact;

public interface Contactrepository extends JpaRepository<Contact, Long> {

}
