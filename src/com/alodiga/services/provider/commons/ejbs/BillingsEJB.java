package com.alodiga.services.provider.commons.ejbs;

import com.alodiga.services.provider.commons.exceptions.EmptyListException;
import javax.ejb.Remote;
import com.alodiga.services.provider.commons.exceptions.GeneralException;
import com.alodiga.services.provider.commons.exceptions.NullParameterException;
import com.alodiga.services.provider.commons.genericEJB.SPGenericEJB;
import com.alodiga.services.provider.commons.models.Account;
import java.sql.Timestamp;
import java.util.Date;

@SuppressWarnings(value = {"all"})
@Remote
  public interface BillingsEJB extends SPGenericEJB {
 public void analyzeRiskAccounts(Account account);
 public void analyzeActivationAccounts(Account account) throws GeneralException, NullParameterException, EmptyListException;
 public void processBilling(Long accountId, Timestamp lastBillingDate, Date yesterday ) throws GeneralException ;
 public void forceBilling(String login) throws GeneralException, EmptyListException;
 public void executeBilling() throws GeneralException;

}
