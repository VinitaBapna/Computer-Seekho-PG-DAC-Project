package com.example.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entities.AdminLogin;
import com.example.repositories.AdminRepository;

@Service
public class AdminModelImpl implements AdminModel
{
	@Autowired
	AdminRepository repository;
	
	@Override
	public void addAdmin(AdminLogin admin)
	{
		repository.save(admin);
	}
	
//	public Optional<AdminLogin> getAdmin(String name)
//	{
//		return repository.findByEmail(name);
//	}
	
	public Optional<AdminLogin> getAdmin(AdminLogin admin)
	{
		return repository.findByEmail(admin.getEmail());
	}
}