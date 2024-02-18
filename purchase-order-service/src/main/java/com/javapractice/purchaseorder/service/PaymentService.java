package com.javapractice.purchaseorder.service;


import org.springframework.stereotype.Service;

import com.javapractice.purchaseorder.dto.Order;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class PaymentService {

	public void processPayment(Order order) throws InterruptedException {
	        log.info("initiate payment for order " + order.getProductId());
	        //call actual payment gateway
	        Thread.sleep(2000L);
	        log.info("completed payment for order " + order.getProductId());
	    }
}


