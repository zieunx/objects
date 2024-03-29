package com.study.objects.chapter2.domain.movie;

import java.time.LocalDateTime;

import com.study.objects.chapter2.domain.common.Money;
import com.study.objects.chapter2.domain.customer.Customer;
import com.study.objects.chapter2.domain.reservation.Reservation;

public class Screening {
    private Movie movie;
    private int sequence;
    private LocalDateTime whenScreened;

    private Screening(Movie movie, int sequence, LocalDateTime whenScreened) {
        this.movie = movie;
        this.sequence = sequence;
        this.whenScreened = whenScreened;
    }

    public LocalDateTime getStartTime() {
        return whenScreened;
    }

    public boolean isSequence(int sequence) {
        return this.sequence == sequence;
    }

    public Money getMovieFee() {
        return movie.getFee();
    }

    public Reservation resrve(Customer customer, int audienceCount) {
        return new Reservation(customer, this, calculateFee(audienceCount), audienceCount);
    }

    private Money calculateFee(int audienceCount) {
        return movie.calculateMovieFee(this).times(audienceCount); // 1인당 예매 요금
        /*
        * Screening 이 Movie 에게 calculateMovieFee 를 호출한다.
        * => Screening 이 Movie 의 calculateMovieFee 메세지를 전송한다.
        * */
    }
}
