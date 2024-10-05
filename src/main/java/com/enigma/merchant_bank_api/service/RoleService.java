package com.enigma.merchant_bank_api.service;

import com.enigma.merchant_bank_api.entity.Role;

public interface RoleService {
    Role getOrSave(Role role);
}
