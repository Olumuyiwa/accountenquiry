package com.techniche.accountenquiry.repository;

import com.techniche.accountenquiry.entity.AccountEnquiryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountEnquiryRepository extends JpaRepository<AccountEnquiryEntity,String> {
//select acct_name,NVL(CLR_BAL_AMT,0),FORACID from tbaadm.gam ;
    @Query(nativeQuery = true,
            value=  " SELECT  a.acct_name as accountName,  a.foracid as accountNumber,  NVL(a.CLR_BAL_AMT,0) as accountBalance" +
                    " from tbaadm.gam a where a.foracid=:accountNo")
    public AccountEnquiryEntity fetchCustomerDetailsByAccountNumber (@Param("accountNo") String accountNo);
}
