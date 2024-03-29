package com.example.demo.dao;



import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.modal.CustomerDetails;

@Repository
public interface CustomerDetailsDao extends JpaRepository<CustomerDetails, UUID> {

	
//	@Transactional
//	@Modifying
//	void deleteCustomerDetailsByAadharNumber(String aadharNumber);
	
	public CustomerDetails findByMobileNumber(String mobileNumber);
}
