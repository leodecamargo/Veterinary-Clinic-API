package com.leodecamargo.VeterinaryClinic.repositories;

import com.leodecamargo.VeterinaryClinic.entities.Pet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PetRepository extends JpaRepository<Pet, Long> {

}
