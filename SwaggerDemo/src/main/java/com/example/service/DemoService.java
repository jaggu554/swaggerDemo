package com.example.service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.ContactEntity;
import com.example.repository.DemoRepository;

@Service
public class DemoService {

	@Autowired
	private DemoRepository demoRepo;

	public List<ContactEntity> getAll() {
		return  demoRepo.findAll();

	}

	public Optional<ContactEntity> findById(String uuid) {
		//
		return demoRepo.findById(UUID.fromString(uuid));
	}
}
