package com.study.objects.chapter2.domain.discount.impl;

import com.study.objects.chapter2.domain.discount.DiscountCondition;
import com.study.objects.chapter2.domain.common.Money;
import com.study.objects.chapter2.domain.movie.Screening;
import com.study.objects.chapter2.domain.discount.DiscountPolicy;

public class AmountDiscountPolicy extends DiscountPolicy {
	private Money discountAmount;

	public AmountDiscountPolicy(Money discountAmount, DiscountCondition... conditions) {
		super(conditions);
		this.discountAmount = discountAmount;
	}

	@Override
	protected Money getDiscountAmount(Screening screening) {
		return discountAmount;
	}
}
