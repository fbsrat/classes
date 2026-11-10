public class Reservation {
    private String roomType;
    private int numberOfNights;
   boolean isWeekend=true;
   private  int reservationTotal;
  public Reservation( String roomType,int numberOfNights,int reservationTotal){
      this.roomType=roomType;
      this.numberOfNights=numberOfNights;
      this.reservationTotal=reservationTotal;
  }


    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public boolean isWeekend() {
        return isWeekend;
    }

    public void setWeekend(boolean weekend) {
        isWeekend = weekend;
    }

    public int getReservationTotal() {
        return reservationTotal;
    }
}
