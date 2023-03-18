package com.diool.referral;

import com.diool.referral.model.Authority;
import com.diool.referral.model.User;
import com.diool.referral.repo.UserDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.password.PasswordEncoder;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class ReferralApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReferralApplication.class, args);
	}

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private UserDetailsRepository userDetailsRepository;

    @PostConstruct
    protected void init(){
        List<Authority> authorityList = new ArrayList<>();

        authorityList.add(createAuthority("USER", "User roles"));
        authorityList.add(createAuthority("ADMIN", "Admin    roles"));

        User user = new User();

        user.setUserName("sop");
        user.setFirstName("sop");
        user.setLastName("Sylvain");
        user.setPassword(passwordEncoder.encode("sop"));
        user.setEmail("sop@gmail.com");
        user.setEnabled(true);
        user.setAuthorities(authorityList);

        //userDetailsRepository.save(user);

    }

    private Authority createAuthority(String roleCode, String roleDesciption){
        Authority authority = new Authority();
        authority.setRoleCode(roleCode);
        authority.setRoleDescription(roleDesciption);
        return  authority;
    }

}
