package com.geekster.MappingPractice.services;

import com.geekster.MappingPractice.models.Address;
import com.geekster.MappingPractice.repositories.AddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {
    @Autowired
    AddressRepo addressRepo;
    public void saveAddress(Address address) {
        addressRepo.save(address);
    }

    public List<Address> getAddress() {
       return addressRepo.findAll();
    }
}
