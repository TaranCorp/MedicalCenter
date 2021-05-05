package com.javateam.medicalcenter.account.application.port.in;

import io.reflectoring.buckpal.account.domain.Account.AccountId;
import io.reflectoring.buckpal.account.domain.Money;

public interface GetAccountBalanceQuery {

	Money getAccountBalance(AccountId accountId);

}
