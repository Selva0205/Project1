package com.flypro32.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flypro32.entity.Lead;

public interface Leadrepository extends JpaRepository<Lead, Long> {

}
