package com.geekster.MappingPractice.repositories;

import com.geekster.MappingPractice.models.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepo extends JpaRepository<Address,Long> {

}
