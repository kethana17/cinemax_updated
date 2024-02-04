// IBookingService.java (Service)
package com.hexaware.cinemax.services;

import com.hexaware.cinemax.dto.BookingDTO;
import com.hexaware.cinemax.entities.Booking;

import java.util.List;

public interface IBookingService {

    Booking bookSeat(BookingDTO bookingDTO);

    List<String> getSeatNumbersByShowId(int showId);

	List<String> getSeatNumbersByUserId(int userId);

    List<Object[]> getUserBookings(int userId);
    List<BookingDTO> getBookingDTOsByUserId(int userId);

    int getTotalSeatNumbersByShowId(int showId);

    void removeBookingById(int bookingId);

    
}
