package com.flypro32.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flypro32.entity.Billing;

public interface BillRepository extends JpaRepository<Billing, Long> {

}
