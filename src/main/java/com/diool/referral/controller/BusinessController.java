package com.diool.referral.controller;

import com.diool.referral.controller.api.BusinessControllerApi;
import com.diool.referral.model.Business;
import com.diool.referral.service.BusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Date;
import java.util.List;

@RestController
public class BusinessController implements BusinessControllerApi {

    @Autowired
    private BusinessService businessService;

    @Override
    public Business saveBusiness(Business business) {
        business.setStatut("Not Activated");
        business.setSignupdate(new Date(2030-10-10));
        business.setTransaction(0);
        return businessService.saveBusiness(business);
    }

    @Override
    public List<Business> listBusiness() {
        return businessService.listBusiness();
    }

    @Override
    public Void updateBusiness(Business business) {
        businessService.updateBusiness(business.getStatut(), business.getNiu());
        return null;
    }

    @Override
    public Void updateAllBusiness(Business business) {
        businessService.updateAllBusiness(business.getStatut(), business.getSignupdate(), business.getTransaction(), business.getNiu());
        return null;
    }

    @Override
    public List<Business> listBusinessById(Integer id) {
        return businessService.listBusinessById(id);
    }
}
