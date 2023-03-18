package com.diool.referral.service;

import com.diool.referral.model.Affiliate;
import com.diool.referral.model.Business;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public interface BusinessService {

    Business saveBusiness(Business business);

    List<Business> listBusiness();
    Void updateBusiness (String statut, String niu);

    // pour mettre ajour toute les informations sur le Business entity
    Void updateAllBusiness (String statut, Date signupdate, Integer transaction, String niu);

    List<Business> listBusinessById(Integer id);
}
