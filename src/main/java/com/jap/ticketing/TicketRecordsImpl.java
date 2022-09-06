package com.jap.ticketing;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TicketRecordsImpl {
    public List<TicketRecords> readFile(String filename){
        List<TicketRecords> records = new ArrayList<>();
        try{
            FileReader fileReader = new FileReader(filename);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = bufferedReader.readLine();
            while((line = bufferedReader.readLine()) != null){
                String[] values = line.split(",");
                String schedule_no = values[0];
                String route_no = values[1];
                int ticket_from_stop_id = Integer.parseInt(values[2]);
                int ticket_from_stop_seq_no = Integer.parseInt(values[3]);
                int ticket_till_stop_id = Integer.parseInt(values[4]);
                int ticket_till_stop_seq_no = Integer.parseInt(values[5]);
                String ticket_date = values[6];
                String ticket_time = values[7];
                double total_ticket_amount = Double.parseDouble(values[8]);
                double travelling_distance = Double.parseDouble(values[9]);

                records.add(new TicketRecords(schedule_no,route_no,ticket_from_stop_id,ticket_from_stop_seq_no,ticket_till_stop_id,ticket_till_stop_seq_no,ticket_date,ticket_time,total_ticket_amount,travelling_distance));

            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return records;
    }
    public List<TicketRecords> sortByDistanceTravelled(List<TicketRecords> ticketsRecords) {
        ticketsRecords.sort(((o1, o2) -> {
                    if (o1.getTravelled_KM() == o2.getTravelled_KM()) {
                        return 0;
                    }
                    if (o1.getTravelled_KM() > o2.getTravelled_KM()) {
                        return -1;
                    } else {
                        return 1;
                    }
                }
                )
        );
        return ticketsRecords;
    }

    public double total_ticket_amount(List<TicketRecords> ticketsRecords){

        Amount amount = ticketsRecords1 -> {
            double totalAmt = 0;
            Iterator<TicketRecords> iterator = ticketsRecords1.iterator();
            while (iterator.hasNext()){
                TicketRecords element = iterator.next();
                totalAmt +=  element.getTotal_ticket_amount();
            }

            return totalAmt;
        };
        return amount.total_ticket_amount(ticketsRecords);
    }

    public static void main(String[] args) {
        TicketRecordsImpl ticketingData = new TicketRecordsImpl();
        String filename = "sample.csv";
        List<TicketRecords> list = ticketingData.readFile(filename);
        System.out.println("Sorted");
        for (TicketRecords element : list){
            System.out.println(element);
        }
        System.out.println("After sorting");
        List<TicketRecords> list2 = ticketingData.sortByDistanceTravelled(list);
        for (TicketRecords element : list2){
            System.out.println(element);
        }
        System.out.println("Total amount = " + ticketingData.total_ticket_amount(list));
    }
}
