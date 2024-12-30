package com.fastcampuspay.remittance.adapter.in.web;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.fastcampuspay.common.WebAdapter;
import com.fastcampuspay.remittance.application.port.in.FindRemittanceCommand;
import com.fastcampuspay.remittance.application.port.in.FindRemittanceUseCase;
import com.fastcampuspay.remittance.domain.RemittanceRequest;

import lombok.RequiredArgsConstructor;

@WebAdapter
@RestController
@RequiredArgsConstructor
public class FindRemittanceHistoryController {

	private final FindRemittanceUseCase findRemittanceUseCase;

	@GetMapping( "/remittance/{membershipId}")
	List<RemittanceRequest> findRemittance(@PathVariable String membershipId) {
		FindRemittanceCommand command = FindRemittanceCommand.builder()
			.membershipId(membershipId)
			.build();

		return findRemittanceUseCase.findRemittanceHistory(command);
	}
}
