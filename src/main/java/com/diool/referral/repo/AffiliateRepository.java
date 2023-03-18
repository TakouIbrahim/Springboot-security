package com.diool.referral.repo;

import com.diool.referral.model.Affiliate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface AffiliateRepository extends JpaRepository<Affiliate, Integer> {


}
