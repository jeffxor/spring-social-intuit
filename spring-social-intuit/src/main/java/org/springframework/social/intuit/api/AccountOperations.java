package org.springframework.social.intuit.api;

import java.util.List;

import com.intuit.sb.cdm.v2.Account;

public interface AccountOperations {
	
	public Account getAccount(Long id);
	public List<Account> getAccounts();
	public List<Account> getBankAccounts();
	public Account update(Account Account);
	public Account create(Account Account);
	/**
	 * Depending on if there is a idType create or update is called. Essentially
	 * a wrapper around create and update to hide the logic.
	 * @param account Account item to be persisted to Intuit.
	 * @return Saved Intuit object containing the idType of saved Intuit item.
	 */
	public Account save(Account account);	
	public boolean delete(Account Account);

}
