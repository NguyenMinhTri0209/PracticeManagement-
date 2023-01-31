package com.PracticeManagement.Manage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.PracticeManagement.Manage.model.Receipt;
import com.PracticeManagement.Manage.service.ReceiptService;

@RestController
public class ReceiptController {
	
	@Autowired
	private ReceiptService receiptService;
	
	@GetMapping("/receipts")
	public List<Receipt> getReceipt(){
		return receiptService.getAll();
	}

	@GetMapping("/receipts/{id}")
	public Receipt getReceiptById(@PathVariable String id) {
		return receiptService.getById(id);
	}
	
	@PostMapping("/receipts")
	public String saveReceipt(@RequestBody Receipt receipt) {
		return receiptService.save(receipt) + " object is save.";
	}
	
	@PutMapping("/receipts/{id}")
	public String updateReceipt(@RequestBody Receipt receipt, @PathVariable String id) {
		return receiptService.update(receipt, id) + " object is update.";
	}

	@DeleteMapping("/receipts/{id}")
	public String deleteReceipt(@PathVariable String id) {
		return receiptService.delete(id) + " object is delete.";
	}
	
	@GetMapping("/sumreceipts/{id}")
	public Long sumOfReceipt(@PathVariable String id) {
		return receiptService.checkBill(id);
	}
}
