package com.codewithnigel.vetclinic.repositories;

import com.codewithnigel.vetclinic.entities.Vet;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface VetRepository extends JpaRepository<Vet, Long> {

    boolean existsByLicenseNumber(String licenseNumber);
    Optional<Vet> findByLicenseNumber(String licenseNumber);
}
