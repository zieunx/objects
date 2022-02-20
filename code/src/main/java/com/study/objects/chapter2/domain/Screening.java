package com.study.objects.chapter2.domain;

import java.time.LocalDateTime;

public class Screening {
    private Movie movie;
    private int sequence;
    private LocalDateTime whenScreened;

    private Screening(Movie movie, int sequence, LocalDateTime whenScreened) {
        this.movie = movie;
        this.sequence = sequence;
        this.whenScreened = whenScreened;
    }

    public LocalDateTime getWhenScreened() {
        return whenScreened;
    }

    public boolean isSequence(int sequence) {
        return this.sequence == sequence;
    }

    public int getMovieFee() {
        return movie.getFee();
    }

    public Resrvation resrve(Customer customer, int audienceCount) {
        return new Reservation(customer, this, caluateFee(audienceCount), audienceCount);
    }

    private Money calculateFee(int audienceCount) {
        return movie.calculateMovieFee(this).times(audienceCount); // 1인당 예매 요금
        /*
        * Screening 이 Movie 에게 calculateMovieFee 를 호출한다.
        * => Screening 이 Movie 의 calculateMovieFee 메세지를 전송한다.
        * */
    }
}
