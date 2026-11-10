public class Room {
boolean isOccupied=false;
boolean isDirty=false;
boolean isAvailable=true;
boolean isRoomClean=true;
    public Room(int numberOfBeds, double price) {
        this.numberOfBeds=numberOfBeds;
        this.price=price;

    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    private int numberOfBeds;
    private double price;


    public  boolean isOccupied(){
        return  isOccupied;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public boolean isDirty() {
return isDirty;
}

    public boolean isRoomClean() {
        return isRoomClean;
    }

    public   void checkIn(){
        if(!isOccupied && !isDirty){
            System.out.println("check in sucessfully ");
        }
         else{
            System.out.println(" no check in");
        }
    }
    public  void checkOut(){
        if (isOccupied && isDirty){
            System.out.println(" check out");
        }
    }
    public void cleanRoom(){
        isDirty=false;
        isRoomClean=true;
    }
}