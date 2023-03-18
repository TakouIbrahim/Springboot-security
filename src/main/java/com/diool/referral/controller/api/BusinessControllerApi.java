package com.diool.referral.controller.api;


import com.diool.referral.model.Business;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000/")
@RequestMapping("/api/v1")
public interface BusinessControllerApi {

    @PostMapping(value = "/business/save", produces = "application/json", consumes = "application/json")
    Business saveBusiness(@RequestBody Business business);


    @GetMapping(value = "/businesss", produces = "application/json")
    List<Business> listBusiness();

    @PutMapping(value = "/update")
    Void updateBusiness(@RequestBody Business business);

    @PutMapping(value = "/updateAll")
    Void updateAllBusiness(@RequestBody Business business);



    @GetMapping(value = "/business/{id}")
    List<Business> listBusinessById(@PathVariable Integer id);
}
