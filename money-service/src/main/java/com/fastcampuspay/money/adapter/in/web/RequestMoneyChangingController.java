package com.fastcampuspay.money.adapter.in.web;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fastcampuspay.common.WebAdapter;
import com.fastcampuspay.money.application.port.in.IncreaseMoneyRequestCommand;
import com.fastcampuspay.money.application.port.in.IncreaseMoneyRequestUseCase;
import com.fastcampuspay.money.domain.MoneyChangingRequest;

import lombok.RequiredArgsConstructor;

@WebAdapter
@RestController
@RequiredArgsConstructor
public class RequestMoneyChangingController {
	private final IncreaseMoneyRequestUseCase increaseMoneyRequestUseCase;

	// private final DecreaseMoneyRequestUseCase decreaseMoneyRequestUseCase;

	@PostMapping(path = "/money/increase")
	MoneyChangingResultDetail increaseMoneyChangingRequest(@RequestBody IncreaseMoneyChangingRequest request) {
		IncreaseMoneyRequestCommand command = IncreaseMoneyRequestCommand.builder()
			.targetMembershipId(request.getTargetMembershipId())
			.amount(request.getAmount())
			.build();

		MoneyChangingRequest moneyChangingRequest = increaseMoneyRequestUseCase.increaseMoneyRequest(command);

		// MoneyChangingRequest -> MoneyChangingResultDetail
		MoneyChangingResultDetail resultDetail = new MoneyChangingResultDetail(
			moneyChangingRequest.getMoneyChangingRequestId(),
			0,
			0,
			moneyChangingRequest.getChangingMoneyAmount()
		);
		return resultDetail;
	}

	@PostMapping(path = "/money/increase/async")
	MoneyChangingResultDetail increaseMoneyChangingRequestAsync(@RequestBody IncreaseMoneyChangingRequest request) {
		IncreaseMoneyRequestCommand command = IncreaseMoneyRequestCommand.builder()
			.targetMembershipId(request.getTargetMembershipId())
			.amount(request.getAmount())
			.build();

		MoneyChangingRequest moneyChangingRequest = increaseMoneyRequestUseCase.increaseMoneyRequestAsync(command);

		// MoneyChangingRequest -> MoneyChangingResultDetail
		MoneyChangingResultDetail resultDetail = new MoneyChangingResultDetail(
			moneyChangingRequest.getMoneyChangingRequestId(),
			0,
			0,
			moneyChangingRequest.getChangingMoneyAmount()
		);
		return resultDetail;
	}

	@PostMapping(path = "/money/decrease")
	MoneyChangingResultDetail decreaseMoneyChangingRequest(@RequestBody DecreaseMoneyChangingRequest request) {
		//        RegisterBankAccountCommand command = RegisterBankAccountCommand.builder()
		//                .membershipId(request.getMembershipId())
		//                .bankName(request.getBankName())
		//                .bankAccountNumber(request.getBankAccountNumber())
		//                .isValid(request.isValid())
		//                .build();

		// registeredBankAccountUseCase.registerBankAccount(command)
		// -> MoneyChangingResultDetail
		// return decreaseMoneyRequestUseCase.decreaseMoneyChangingRequest(command);
		return null;
	}
}
