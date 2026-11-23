package com.codewithnigel.vetclinic.repositories;

import com.codewithnigel.vetclinic.entities.Owner;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface OwnerRepository extends JpaRepository<Owner, Long> {

    boolean existsByEmail(String email);

    Optional<Owner> findByEmail(String email);
}


