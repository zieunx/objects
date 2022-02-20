package com.study.objects.chapter1.domain;

// 판매원
public class TicketSeller {
    private TicketOffice ticketOffice;

    public TicketSeller(TicketOffice ticketOffice) {
        this.ticketOffice = ticketOffice;
    }

    // getTicketOffice() 메소드 제거

    // TicketSeller가 Audience의 인터페이스에만 의존하도록 수정했다.
    public void sellTo(Audience audience) {
        ticketOffice.plusAmount(audience.buy(ticketOffice.getTicket()));
    }
}
