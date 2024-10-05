package com.enigma.merchant_bank_api.repository;

import com.enigma.merchant_bank_api.constant.ERole;
import com.enigma.merchant_bank_api.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role,String> {
    Optional<Role> findByName(ERole name);

}
