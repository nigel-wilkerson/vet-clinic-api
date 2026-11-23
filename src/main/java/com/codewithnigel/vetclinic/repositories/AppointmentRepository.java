package com.codewithnigel.vetclinic.repositories;

import com.codewithnigel.vetclinic.entities.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {

    List<Appointment> findByVetId(Long vetId);
    List<Appointment> findByPetId(Long petId);
}
