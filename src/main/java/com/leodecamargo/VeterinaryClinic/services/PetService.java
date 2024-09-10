package com.leodecamargo.VeterinaryClinic.services;

import com.leodecamargo.VeterinaryClinic.entities.Pet;
import com.leodecamargo.VeterinaryClinic.repositories.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PetService {

    @Autowired
    private PetRepository repository;

    public List<Pet> findAll() {
        return repository.findAll();
    }
}
