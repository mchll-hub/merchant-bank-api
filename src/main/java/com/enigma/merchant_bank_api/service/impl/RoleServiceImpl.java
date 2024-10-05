package com.enigma.merchant_bank_api.service.impl;

import com.enigma.merchant_bank_api.entity.Role;
import com.enigma.merchant_bank_api.repository.RoleRepository;
import com.enigma.merchant_bank_api.service.RoleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class RoleServiceImpl implements RoleService {

    private final RoleRepository roleRepository;

    @Override
    public Role getOrSave(Role role) {
        Optional<Role> optionalRole = roleRepository.findByName(role.getName());
        if (!optionalRole.isEmpty()) {
            return optionalRole.get();
        }
        return roleRepository.save(role);
    }
}
