package com.study.objects.chapter2.domain;

public class SequenceCondition implements DiscountCondition {

	private int sequence;

	public SequenceCondition(int sequence) {
		this.sequence = sequence;
	}

	@Override
	public boolean isSatisfiedBy(Screening screening) {
		return screening.isSequence(sequence);
	}
}
