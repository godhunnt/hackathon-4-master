package com.jap.ticketing;

import java.util.List;

public interface Amount {
    double total_ticket_amount(List<TicketRecords> ticketsRecords);
}
