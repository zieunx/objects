package com.study.objects.chapter2.code;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalTime;

import com.study.objects.chapter2.domain.discount.impl.AmountDiscountPolicy;
import com.study.objects.chapter2.domain.common.Money;
import com.study.objects.chapter2.domain.discount.impl.NoneDiscountPolicy;
import com.study.objects.chapter2.domain.movie.Movie;
import com.study.objects.chapter2.domain.discount.impl.PercentDiscountPolicy;
import com.study.objects.chapter2.domain.discount.impl.PeriodCondition;
import com.study.objects.chapter2.domain.discount.impl.SequenceCondition;

/**
 * 영화 '아바타'와 '타이타닉'을 할인정책과 조건에 맞춰 생성.
 */
public class CreateMovieExample {

	public void createMovies() {
		/*
		* 아바타
		* - 할인정책: 금액할인(800원)
		* - 할인조건: 순번1, 순번10, 월요일 10:00~11~59, 화요일 10:00~20:59
		* */
		Movie avatar = new Movie("아바타",
			Duration.ofMinutes(120),
			Money.wons(10000),
			new AmountDiscountPolicy(Money.wons(800),
				new SequenceCondition(1),
				new SequenceCondition(10),
				new PeriodCondition(DayOfWeek.MONDAY, LocalTime.of(10, 0), LocalTime.of(11, 59)),
				new PeriodCondition(DayOfWeek.THURSDAY, LocalTime.of(10, 0), LocalTime.of(20, 59))));

		/*
		 * 타이타닉
		 * - 할인정책: 비율할인(800원)
		 * - 할인조건: 화요일 14:00~16:59, 순번2, 목요일 10:00~13:59
		 * */
		Movie titanic = new Movie("타이타닉",
			Duration.ofMinutes(180),
			Money.wons(11000),
			new PercentDiscountPolicy(0.1,
				new PeriodCondition(DayOfWeek.TUESDAY, LocalTime.of(14, 0), LocalTime.of(16, 59)),
				new SequenceCondition(2),
				new PeriodCondition(DayOfWeek.THURSDAY, LocalTime.of(10, 0), LocalTime.of(13, 59))));

		Movie starWars = new Movie("스타워즈",
			Duration.ofMinutes(210),
			Money.wons(10000),
			new NoneDiscountPolicy());
	}
}
