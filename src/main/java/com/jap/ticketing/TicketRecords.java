package com.jap.ticketing;

public class TicketRecords {
   private String schedule_no;
   private String route_no;
    private int ticket_from_stop_id;
   private int ticket_from_stop_seq_no;
   private int ticket_till_stop_id;
   private int ticket_till_stop_seq_no;
    private String ticket_date;
   private String ticket_time;
   private Double total_ticket_amount;
   private Double travelled_KM;

    public TicketRecords(String schedule_no, String route_no, int ticket_from_stop_id, int ticket_from_stop_seq_no, int ticket_till_stop_id, int ticket_till_stop_seq_no, String ticket_date, String ticket_time, Double total_ticket_amount, Double travelled_KM) {
        this.schedule_no = schedule_no;
        this.route_no = route_no;
        this.ticket_from_stop_id = ticket_from_stop_id;
        this.ticket_from_stop_seq_no = ticket_from_stop_seq_no;
        this.ticket_till_stop_id = ticket_till_stop_id;
        this.ticket_till_stop_seq_no = ticket_till_stop_seq_no;
        this.ticket_date = ticket_date;
        this.ticket_time = ticket_time;
        this.total_ticket_amount = total_ticket_amount;
        this.travelled_KM = travelled_KM;
    }

    public String getSchedule_no() {
        return schedule_no;
    }

    public void setSchedule_no(String schedule_no) {
        this.schedule_no = schedule_no;
    }

    public String getRoute_no() {
        return route_no;
    }

    public void setRoute_no(String route_no) {
        this.route_no = route_no;
    }

    public int getTicket_from_stop_id() {
        return ticket_from_stop_id;
    }

    public void setTicket_from_stop_id(int ticket_from_stop_id) {
        this.ticket_from_stop_id = ticket_from_stop_id;
    }

    public int getTicket_from_stop_seq_no() {
        return ticket_from_stop_seq_no;
    }

    public void setTicket_from_stop_seq_no(int ticket_from_stop_seq_no) {
        this.ticket_from_stop_seq_no = ticket_from_stop_seq_no;
    }

    public int getTicket_till_stop_id() {
        return ticket_till_stop_id;
    }

    public void setTicket_till_stop_id(int ticket_till_stop_id) {
        this.ticket_till_stop_id = ticket_till_stop_id;
    }

    public int getTicket_till_stop_seq_no() {
        return ticket_till_stop_seq_no;
    }

    public void setTicket_till_stop_seq_no(int ticket_till_stop_seq_no) {
        this.ticket_till_stop_seq_no = ticket_till_stop_seq_no;
    }

    public String getTicket_date() {
        return ticket_date;
    }

    public void setTicket_date(String ticket_date) {
        this.ticket_date = ticket_date;
    }

    public String getTicket_time() {
        return ticket_time;
    }

    public void setTicket_time(String ticket_time) {
        this.ticket_time = ticket_time;
    }

    public Double getTotal_ticket_amount() {
        return total_ticket_amount;
    }
    public void setTotal_ticket_amount(Double total_ticket_amount) {
        this.total_ticket_amount = total_ticket_amount;
    }

    public Double getTravelled_KM() {
        return travelled_KM;
    }

    public void setTravelled_KM(Double travelled_KM) {
        this.travelled_KM = travelled_KM;
    }
    public String toString() {
        return "TicketRecords{" +
                "schedule_no='" + schedule_no + '\'' +
                ", route_no='" + route_no + '\'' +
                ", ticket_from_stop_id=" + ticket_from_stop_id +
                ", ticket_from_stop_seq_no=" + ticket_from_stop_seq_no +
                ", ticket_till_stop_id=" + ticket_till_stop_id +
                ", ticket_till_stop_seq_no=" + ticket_till_stop_seq_no +
                ", ticket_date='" + ticket_date + '\'' +
                ", ticket_time='" + ticket_time + '\'' +
                ", total_ticket_amount=" + total_ticket_amount +
                ", travelled_KM=" + travelled_KM +
                '}';
    }

}
