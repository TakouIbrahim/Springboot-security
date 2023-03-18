package com.diool.referral.controller.api;

import com.diool.referral.model.Affiliate;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000/")
@RequestMapping("/api/v1")
public interface AffiliateControllerApi {

@PostMapping(value = "/affiliate/save")
    Affiliate saveAffiliate(@RequestBody Affiliate affiliate);

@GetMapping(value = "/affiliates")
    List<Affiliate> listAffiliate();

}


