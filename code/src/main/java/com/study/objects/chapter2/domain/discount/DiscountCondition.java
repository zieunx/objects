package com.study.objects.chapter2.domain.discount;

import com.study.objects.chapter2.domain.movie.Screening;

public interface DiscountCondition {
	boolean isSatisfiedBy(Screening screening);
}
