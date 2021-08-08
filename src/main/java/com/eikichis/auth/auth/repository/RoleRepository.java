package com.eikichis.auth.auth.repository;

import java.util.Optional;

import com.eikichis.auth.auth.models.ERole;
import com.eikichis.auth.auth.models.Role;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface RoleRepository extends MongoRepository<Role, String> {
    Optional<Role> findByName(ERole name);
  }