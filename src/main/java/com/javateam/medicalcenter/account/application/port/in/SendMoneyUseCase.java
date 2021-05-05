package com.javateam.medicalcenter.account.application.port.in;

import io.reflectoring.buckpal.account.domain.Account.AccountId;
import io.reflectoring.buckpal.account.domain.Money;
import io.reflectoring.buckpal.common.SelfValidating;

public interface SendMoneyUseCase {

	boolean sendMoney(SendMoneyCommand command);

}
