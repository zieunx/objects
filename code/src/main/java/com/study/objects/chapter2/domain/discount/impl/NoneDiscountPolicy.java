package com.study.objects.chapter2.domain.discount.impl;

import com.study.objects.chapter2.domain.common.Money;
import com.study.objects.chapter2.domain.discount.DiscountCondition;
import com.study.objects.chapter2.domain.discount.DiscountPolicy;
import com.study.objects.chapter2.domain.movie.Screening;

public class NoneDiscountPolicy extends DiscountPolicy {

	@Override
	protected Money getDiscountAmount(Screening screening) {
		return Money.ZERO;
	}
}
