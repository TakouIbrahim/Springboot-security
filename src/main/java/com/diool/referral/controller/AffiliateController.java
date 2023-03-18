package com.diool.referral.controller;

import com.diool.referral.controller.api.AffiliateControllerApi;
import com.diool.referral.model.Affiliate;
import com.diool.referral.service.AffiliateService;
import com.diool.referral.utils.Md5Code;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AffiliateController implements AffiliateControllerApi {

    @Autowired
    private AffiliateService affiliateService;

    @Override
    public Affiliate saveAffiliate(Affiliate affiliate) {
        String a = Md5Code.getMd5Hash(affiliate.getPasswd());
        affiliate.setPasswd(a);
        affiliate.setStatut("false");
        return affiliateService.saveAffiliate(affiliate);
    }

    @Override
    public List<Affiliate> listAffiliate() {
        return affiliateService.listAffiliate();
    }
}
