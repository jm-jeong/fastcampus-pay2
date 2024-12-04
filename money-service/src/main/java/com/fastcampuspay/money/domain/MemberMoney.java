package com.fastcampuspay.money.domain;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Value;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class MemberMoney {
	@Getter private final String memberMoneyId;
	@Getter private final String membershipId;

	//잔액
	@Getter private final int balance;

	// @Getter private final int linkedBankAccount;

	public static MemberMoney generateMemberMoney(
		MemberMoneyId memberMoneyId,
		MembershipId membershipId,
		MoneyBalance moneyBalance
	) {
		return new MemberMoney(
			memberMoneyId.memberMoneyId,
			membershipId.membershipId,
			moneyBalance.balance
		);
	}

	@Value
	public static class MemberMoneyId {
		public MemberMoneyId(String memberMoneyId) {
			this.memberMoneyId = memberMoneyId;
		}
		String memberMoneyId;
	}

	@Value
	public static class MembershipId {
		String membershipId;

		public MembershipId(String membershipId) {
			this.membershipId = membershipId;
		}
	}

	@Value
	public static class MoneyBalance {
		public MoneyBalance(int balance) {
			this.balance = balance;
		}
		int balance;
	}
}
