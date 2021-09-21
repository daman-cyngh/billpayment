package com.example.BillPayment.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.BillPayment.Repo.MasterBillersRepository;

@Service
public class MasterBillersService {
	
	@Autowired
	private MasterBillersRepository masterBillersRepository;

	public MasterBillersService(MasterBillersRepository masterBillersRepository) {
		super();
		this.masterBillersRepository = masterBillersRepository;
	}

}
