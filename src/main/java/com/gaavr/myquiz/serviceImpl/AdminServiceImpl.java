package com.gaavr.myquiz.serviceImpl;

import com.gaavr.myquiz.entity.AdminEntity;
import com.gaavr.myquiz.repository.AdminRepository;
import com.gaavr.myquiz.service.AdminService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AdminServiceImpl implements AdminService {

    private final AdminRepository adminRepository;

    @Override
    public AdminEntity createAdmin(AdminEntity admin) {
        return adminRepository.save(admin);
    }

    @Override
    public AdminEntity getAdminById(Long id) {
        return adminRepository.findById(id).orElse(null);
    }

    @Override
    public List<AdminEntity> getAllAdmins() {
        return adminRepository.findAll();
    }

    @Override
    public AdminEntity updateAdmin(AdminEntity admin) {
        return adminRepository.save(admin);
    }

    @Override
    public void deleteAdmin(Long id) {
        adminRepository.deleteById(id);
    }
}
