package com.leodecamargo.VeterinaryClinic.resources;

import com.leodecamargo.VeterinaryClinic.entities.Pet;
import com.leodecamargo.VeterinaryClinic.services.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/pets")
public class PetResource {

    @Autowired
    private PetService service;

    @GetMapping
    public ResponseEntity<List<Pet>> findAll() {
        List<Pet> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }
}
