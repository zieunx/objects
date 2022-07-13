package com.study.objects.chapter2.domain.discount.impl;

import com.study.objects.chapter2.domain.discount.DiscountCondition;
import com.study.objects.chapter2.domain.common.Money;
import com.study.objects.chapter2.domain.movie.Screening;
import com.study.objects.chapter2.domain.discount.DiscountPolicy;

public class PercentDiscountPolicy extends DiscountPolicy {
	private double percent;

	public PercentDiscountPolicy(double percent, DiscountCondition... conditions) {
		super(conditions);
		this.percent = percent;
	}

	@Override
	protected Money getDiscountAmount(Screening screening) {
		return screening.getMovieFee().times(percent);
	}
}
