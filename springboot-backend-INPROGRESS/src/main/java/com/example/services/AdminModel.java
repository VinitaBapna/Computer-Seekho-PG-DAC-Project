package com.example.services;

import java.util.Optional;

import com.example.entities.AdminLogin;

public interface AdminModel 
{
	void addAdmin(AdminLogin admin);
	Optional<AdminLogin> getAdmin(AdminLogin admin);

}