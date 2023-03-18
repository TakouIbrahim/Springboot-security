package com.diool.referral.service.impl;

import com.diool.referral.model.Business;
import com.diool.referral.repo.BusinessRepository;
import com.diool.referral.service.BusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class BusinessServiceImpl implements BusinessService {

    @Autowired
    private final BusinessRepository businessRepository;

    public BusinessServiceImpl(BusinessRepository businessRepository){
        this.businessRepository= businessRepository;
    }

    @Override
    public Business saveBusiness(Business business) {
        return businessRepository.save(business);
    }

    @Override
    public List<Business> listBusiness() {
        return businessRepository.findAll();
    }

    @Override
    public Void updateBusiness(String statut, String niu) {
            businessRepository.updateBusiness(statut, niu);
            System.out.println("bonjour");
            System.out.println(statut);
            System.out.println(niu);

        return null ;
    }

    @Override
    public Void updateAllBusiness(String statut, Date signupdate, Integer transaction, String niu) {
        businessRepository.updateAllBusiness(statut, signupdate, transaction, niu);
        return null ;
    }

    @Override
    public List<Business> listBusinessById(Integer id) {
        return businessRepository.findAllByAffiliate_Id(id);
    }
}
