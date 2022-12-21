package com.dreamteam.goodpc.data;

import com.dreamteam.goodpc.entities.Service;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ServiceRepository extends JpaRepository<Service, Long> {
    Optional<Service> findByName(String name);
}