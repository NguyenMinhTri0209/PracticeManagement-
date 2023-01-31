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

import com.PracticeManagement.Manage.model.Receiptdtl;
import com.PracticeManagement.Manage.service.ReceiptdtlService;

@RestController
public class ReceiptdtlController {
	
	@Autowired
	private ReceiptdtlService receiptdtlService;
	
	@GetMapping("/receiptdtls")
	public List<Receiptdtl> getReceiptdtl(){
		return receiptdtlService.getAll();
	}
	
	@GetMapping("/receiptdtls/{id}")
	public Receiptdtl getReceiptdtlById(@PathVariable String id) {
		return receiptdtlService.getById(id);
	}
	
	@PostMapping("/receiptdtls")
	public String saveReceiptdtl(@RequestBody Receiptdtl receiptdtl) {
		return receiptdtlService.save(receiptdtl) + " object is save.";
	}
	
	@PutMapping("/receiptdtls/{id}")
	public String updateReceiptdtl(@RequestBody Receiptdtl receiptdtl, @PathVariable String id) {
		return receiptdtlService.update(receiptdtl, id) + " object is update.";
	}
	
	@DeleteMapping("/receiptdtls/{id}")
	public String deleteReceiptdtl(@PathVariable String id) {
		return receiptdtlService.delete(id) + " object is delete.";
	}
}
