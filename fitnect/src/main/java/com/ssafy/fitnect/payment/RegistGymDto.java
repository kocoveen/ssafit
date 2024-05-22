package com.ssafy.fitnect.payment;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RegistGymDto {
	private long userId;
	private long gymId;
	private long priceId;
	private int days;
}
