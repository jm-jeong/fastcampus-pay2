package com.fastcampuspay.remittance.application.port.in;

import javax.validation.constraints.NotNull;

import com.fastcampuspay.common.SelfValidating;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Builder
@Data
@EqualsAndHashCode(callSuper = false)
public class FindRemittanceCommand extends SelfValidating<FindRemittanceCommand> {

	@NotNull
	private String membershipId;

	public FindRemittanceCommand(String membershipId) {
		this.membershipId = membershipId;

		this.validateSelf();
	}
}
