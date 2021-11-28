package com.techniche.accountenquiry.repository;

//import com.techniche.accountenquiry.entity.AccountEnquiryEntity;
import com.techniche.accountenquiry.entity.AccountEnquiryEntity2;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountEnquiryRepository extends JpaRepository<AccountEnquiryEntity2,String> {
//select acct_name,NVL(CLR_BAL_AMT,0),FORACID from tbaadm.gam ;
    AccountEnquiryEntity2 accountEnquiryEntity2 = null;
    @Query(nativeQuery = true,
            value=  " SELECT acid , acct_name , foracid ,clr_bal_amt from tbaadm.gam a where a.foracid=:accountNo")
    public AccountEnquiryEntity2 fetchCustomerDetailsByAccountNumber (@Param("accountNo") String accountNo);


}
