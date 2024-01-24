package com.example.controller;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.ContactEntity;
import com.example.service.DemoService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RequestMapping
@RestController
public class DemoController {
	@Autowired
	private DemoService demoSerivce;

	@GetMapping("/we")
	public List<ContactEntity> getWelcome(@RequestBody String request) {
		return demoSerivce.getAll();
	}

	@GetMapping("/we/{uuid}")
	public Optional<ContactEntity> getData(@RequestBody String uuid) {
		return demoSerivce.findById(uuid);
	}

}
