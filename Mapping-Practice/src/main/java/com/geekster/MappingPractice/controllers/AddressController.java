package com.geekster.MappingPractice.controllers;

import com.geekster.MappingPractice.models.Address;
import com.geekster.MappingPractice.services.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/address")
public class AddressController {
    @Autowired
    AddressService addressService;

    @PostMapping("/saveAddress")
    public void saveAddress(@RequestBody Address address){
        addressService.saveAddress(address);
    }

    @GetMapping("/getAddress")
    public List<Address> getAddress(){
        return addressService.getAddress();
    }
}
