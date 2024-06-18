package com.flypro32.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flypro32.entity.Billing;
import com.flypro32.repository.BillRepository;
@Service
public class BillingServiceImpl implements BillingService {
	@Autowired
	private BillRepository billrepo;

	@Override
	public void savebillData(Billing bills) {
		billrepo.save(bills);

	}

}
