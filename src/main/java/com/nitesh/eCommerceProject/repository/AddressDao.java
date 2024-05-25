package com.nitesh.eCommerceProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nitesh.eCommerceProject.entity.Address;

@Repository
public interface AddressDao extends JpaRepository<Address, Integer>{

}
