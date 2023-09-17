package com.gaavr.myquiz.service;

import com.gaavr.myquiz.entity.AdminEntity;

import java.util.List;

public interface AdminService {
    AdminEntity createAdmin(AdminEntity admin);

    AdminEntity getAdminById(Long id);

    List<AdminEntity> getAllAdmins();

    AdminEntity updateAdmin(AdminEntity admin);

    void deleteAdmin(Long id);
}
