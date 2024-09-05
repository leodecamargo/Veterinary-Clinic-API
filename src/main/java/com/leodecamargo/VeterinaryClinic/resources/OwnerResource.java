package com.leodecamargo.VeterinaryClinic.resources;

import com.leodecamargo.VeterinaryClinic.entities.Owner;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/owners")
public class OwnerResource {

    @GetMapping
    public ResponseEntity<List<Owner>> findAll() {
        List<Owner> list = new ArrayList<>();
        list.add(new Owner(1L, "Bob", "St Clair Ave", "4670000000"));
        list.add(new Owner(2L, "Ana", "Dundas St", "4670000001"));
        return ResponseEntity.ok().body(list);
    }
}
