package com.study.objects.chapter2.domain;

public interface DiscountCondition {
	boolean isSatisfiedBy(Screening screening);
}
