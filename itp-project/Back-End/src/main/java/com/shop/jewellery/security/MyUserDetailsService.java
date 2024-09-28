package com.shop.jewellery.security;

import com.shop.jewellery.entity.Admin;
import com.shop.jewellery.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MyUserDetailsService implements UserDetailsService {
    private AdminRepository adminRepository;

    @Autowired
    public MyUserDetailsService(AdminRepository adminRepository) {
        this.adminRepository = adminRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String uname) throws UsernameNotFoundException {
        Optional<Admin> admin= this.adminRepository.findByUname(uname);

        admin.orElseThrow(() -> new UsernameNotFoundException("Admin does not exist" + uname));

        return admin.map(MyUserDetails::new).get();
    }
}
