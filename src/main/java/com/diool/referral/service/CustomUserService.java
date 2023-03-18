package com.diool.referral.service;

import com.diool.referral.model.User;
import com.diool.referral.repo.UserDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserService implements UserDetailsService {

    @Autowired
    UserDetailsRepository userDetailsRepository;

    @Override
    public User loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userDetailsRepository.findByUserName(username);

        if (null==user){
            throw new UsernameNotFoundException("User Not Found with"+ username);
        }
        return user;
    }
}
