
package com.mycompany.seattype;


public class SeatTypeTest {
  public static void main(String[] args) {
     SeatType A = new SeatType(  );
     SeatType B = new SeatType(  );
     SeatType C = new SeatType(  );
A.setNumberOfSeats(4);
A.setPricePerSeat(100);
B.setNumberOfSeats(3);
 B.setPricePerSeat(200);
C.setNumberOfSeats(6);
C.setPricePerSeat(250);
 double totalSales=(A.getNumberOfSeats()*A.getPricePerSeat())+(B.getNumberOfSeats()*B.getPricePerSeat())+(C.getNumberOfSeats()*C.getPricePerSeat());
System.out.println(totalSales);
}
}