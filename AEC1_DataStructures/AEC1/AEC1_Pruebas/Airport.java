package AEC1.AEC1_Pruebas;

public interface Aeropuerto {
    // Register a user in the system
    void registerUser(String name, String passportNumber, String nationality);
  
    // Check-in a user for their flight
    void checkInUser(String passportNumber, String flightNumber);
  
    // Board a user onto their flight
    void boardUser(String passportNumber, String flightNumber);
  
    // Get the number of users currently waiting in the waiting zone
    int getWaitingZoneCount();
  
    // Get the number of users currently in the commercial zone
    int getCommercialZoneCount();
  
    // Get the next user in line for check-in
    String getNextCheckInUser();
  
    // Get the next user in line for boarding
    String getNextBoardingUser();
  
    // Preconditions for registering a user
    boolean canRegisterUser(String passportNumber);
  
    // Preconditions for checking in a user
    boolean canCheckInUser(String passportNumber, String flightNumber);
  
    // Preconditions for boarding a user
    boolean canBoardUser(String passportNumber, String flightNumber);
  }