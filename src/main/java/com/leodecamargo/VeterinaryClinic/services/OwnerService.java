package com.leodecamargo.VeterinaryClinic.services;

import com.leodecamargo.VeterinaryClinic.entities.Owner;
import com.leodecamargo.VeterinaryClinic.repositories.OwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OwnerService {

    @Autowired
    private OwnerRepository repository;

    public List<Owner> findAll() {
        return repository.findAll();
    }
}
