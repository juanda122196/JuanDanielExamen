package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.ReaccionModel;

public interface ReaccionRepository extends JpaRepository<ReaccionModel, Long> {

}
