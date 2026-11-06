package com.example.BookingApp.mapper;

import com.example.BookingApp.dto.response.BookingResponse;
import com.example.BookingApp.entity.Booking;
import com.example.BookingApp.entity.User;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-11-06T15:12:53+0300",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.4.jar, environment: Java 17.0.17 (Microsoft)"
)
@Component
public class BookingMapperImpl implements BookingMapper {

    @Autowired
    private EventMapper eventMapper;

    @Override
    public BookingResponse toDto(Booking entity) {
        if ( entity == null ) {
            return null;
        }

        BookingResponse bookingResponse = new BookingResponse();

        bookingResponse.setCustomerEmail( entityUserEmail( entity ) );
        bookingResponse.setTicketCount( entity.getBookingsAmount() );
        bookingResponse.setId( entity.getId() );
        bookingResponse.setEvent( eventMapper.toDto( entity.getEvent() ) );
        bookingResponse.setCreatedAt( entity.getCreatedAt() );
        bookingResponse.setConfirmed( entity.getConfirmed() );

        return bookingResponse;
    }

    @Override
    public List<BookingResponse> toDtoList(List<Booking> entities) {
        if ( entities == null ) {
            return null;
        }

        List<BookingResponse> list = new ArrayList<BookingResponse>( entities.size() );
        for ( Booking booking : entities ) {
            list.add( toDto( booking ) );
        }

        return list;
    }

    private String entityUserEmail(Booking booking) {
        if ( booking == null ) {
            return null;
        }
        User user = booking.getUser();
        if ( user == null ) {
            return null;
        }
        String email = user.getEmail();
        if ( email == null ) {
            return null;
        }
        return email;
    }
}
