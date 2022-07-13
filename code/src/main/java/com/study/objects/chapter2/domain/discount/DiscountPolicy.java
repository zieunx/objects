package com.study.objects.chapter2.domain.discount;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.study.objects.chapter2.domain.common.Money;
import com.study.objects.chapter2.domain.movie.Screening;

public abstract class DiscountPolicy {
	private List<DiscountCondition> contitions = new ArrayList<>();

	public DiscountPolicy(DiscountCondition ... conditions) {
		this.contitions = Arrays.asList(conditions);
	}

	public Money calculateDiscountAmount(Screening screening) {
		for (DiscountCondition each : contitions) {
			if (each.isSatisfiedBy(screening)) {
				return getDiscountAmount(screening);
			}
		}

		return Money.ZERO;
	}

	abstract protected Money getDiscountAmount(Screening screening);
}
