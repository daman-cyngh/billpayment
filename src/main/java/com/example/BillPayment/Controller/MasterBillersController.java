package com.example.BillPayment.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.BillPayment.Service.MasterBillersService;

@RestController
public class MasterBillersController {
	
	@Autowired
	private MasterBillersService masterBillersService;

	public MasterBillersController(MasterBillersService masterBillersService) {
		super();
		this.masterBillersService = masterBillersService;
	}
	
	

}
