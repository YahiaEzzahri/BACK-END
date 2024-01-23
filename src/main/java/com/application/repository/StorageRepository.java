package com.application.repository;

import com.application.model.PDF;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StorageRepository extends JpaRepository<PDF,Long> {


    Optional<PDF> findByName(String fileName);

}