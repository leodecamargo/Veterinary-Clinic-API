package com.leodecamargo.VeterinaryClinic.resources;

import com.leodecamargo.VeterinaryClinic.entities.Owner;
import com.leodecamargo.VeterinaryClinic.services.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/owners")
public class OwnerResource {

    @Autowired
    private OwnerService service;

    @GetMapping
    public ResponseEntity<List<Owner>> findAll() {
        List<Owner> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }
}
