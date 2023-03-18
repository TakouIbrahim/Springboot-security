package com.diool.referral.service.impl;
import com.diool.referral.model.Affiliate;
import com.diool.referral.repo.AffiliateRepository;
import com.diool.referral.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AffiliateServiceImpl implements AffiliateService {

    @Autowired
    private final AffiliateRepository affiliateRepository;

    public AffiliateServiceImpl(AffiliateRepository affiliateRepository)
    {
        this.affiliateRepository = affiliateRepository;
    }

    @Override
    public Affiliate saveAffiliate(Affiliate affiliate) {
        return affiliateRepository.save(affiliate);
    }

    @Override
    public List<Affiliate> listAffiliate() {

        return affiliateRepository.findAll();
    }
}
