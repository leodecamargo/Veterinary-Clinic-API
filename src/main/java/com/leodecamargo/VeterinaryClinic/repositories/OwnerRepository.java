package com.leodecamargo.VeterinaryClinic.repositories;

import com.leodecamargo.VeterinaryClinic.entities.Owner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OwnerRepository extends JpaRepository<Owner, Long> {

}
