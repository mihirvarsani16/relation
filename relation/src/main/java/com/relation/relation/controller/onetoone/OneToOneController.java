package com.relation.relation.controller.onetoone;

import com.relation.relation.entity.onetoone.Address;
import com.relation.relation.repository.onetoone.AddressRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OneToOneController {

    @Autowired
    private AddressRepository addressRepository;

    @PostMapping("/add")
    public Address add(@RequestBody Address address) {

        

        return this.addressRepository.save(address);
    }

}
