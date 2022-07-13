package com.study.objects.chapter2.domain.reservation;

import com.study.objects.chapter2.domain.common.Money;
import com.study.objects.chapter2.domain.customer.Customer;
import com.study.objects.chapter2.domain.movie.Screening;

public class Reservation {
	private Customer customer;
	private Screening screening;
	private Money fee;
	private int audienceCount;

	public Reservation(Customer customer, Screening screening, Money fee, int audienceCount) {
		this.customer = customer;
		this.screening = screening;
		this.fee = fee;
		this.audienceCount = audienceCount;
	}
}
