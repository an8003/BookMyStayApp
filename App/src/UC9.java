class InvalidBookingException extends Exception {

    InvalidBookingException(String msg){
        super(msg);
    }
}

public class UC9 {

    static void validate(String roomType) throws InvalidBookingException{

        if(roomType==null || roomType.isEmpty())
            throw new InvalidBookingException("Invalid Room Type");

        System.out.println("Valid Booking for "+roomType);
    }

    public static void main(String[] args) {

        try {
            validate("");
        }
        catch(Exception e){
            System.out.println("Error: "+e.getMessage());
        }
    }
}