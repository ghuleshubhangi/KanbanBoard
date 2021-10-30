package com.example.loginpage.service;

import com.example.loginpage.entity.RegistrationEntity;

public interface RegistrationService {

	RegistrationEntity saveRegistrationService(RegistrationEntity registrationEntity);

	RegistrationEntity loginservice(String email, String password);

}
