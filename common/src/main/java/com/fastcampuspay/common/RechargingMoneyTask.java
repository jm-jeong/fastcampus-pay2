package com.fastcampuspay.common;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class RechargingMoneyTask {

	private String taskID;
	private String taskName;

	private String membershipID;

	private List<SubTask> subTaskList;

	//법인 계좌
	private String toBankName;

	//법인 계좌 번호
	private String toBankAccountNumber;

	private int moneyAmount; // only won
}
