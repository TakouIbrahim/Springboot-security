package com.diool.referral.repo;

import com.diool.referral.model.Business;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Repository
public interface BusinessRepository extends JpaRepository<Business, Integer> {



   @Modifying
   @Transactional
   @Query("update Business b set b.statut = :statut where b.niu = :niu")
   void updateBusiness(String statut, String niu);
    //@Query(value = "UPDATE Business set statut = ?1 where mail = ?2 ", nativeQuery = true)
    //void updateBusiness(String status, String mail);


   @Modifying
   @Transactional
   @Query("update Business b set b.statut = :statut, b.signupdate = :signupdate, b.transaction = :transaction where b.niu = :niu")
   void updateAllBusiness(String statut, Date signupdate, Integer transaction, String niu);


   List<Business> findAllByAffiliate_Id (Integer id);

   //List<Business> findAllByMail (String mail);

}
