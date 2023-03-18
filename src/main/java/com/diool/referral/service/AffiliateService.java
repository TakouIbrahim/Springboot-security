package com.diool.referral.service;

import com.diool.referral.model.Affiliate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AffiliateService {

    Affiliate saveAffiliate(Affiliate affiliate);

    List<Affiliate> listAffiliate();
}
