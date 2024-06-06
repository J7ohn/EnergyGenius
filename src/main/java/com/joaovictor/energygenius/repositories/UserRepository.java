package com.joaovictor.energygenius.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joaovictor.energygenius.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
