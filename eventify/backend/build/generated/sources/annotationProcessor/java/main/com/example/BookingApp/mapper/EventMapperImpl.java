package com.example.BookingApp.mapper;

import com.example.BookingApp.dto.request.EventCreateRequest;
import com.example.BookingApp.dto.request.EventUpdateRequest;
import com.example.BookingApp.dto.response.EventResponse;
import com.example.BookingApp.entity.Event;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-11-06T15:12:53+0300",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.4.jar, environment: Java 17.0.17 (Microsoft)"
)
@Component
public class EventMapperImpl implements EventMapper {

    @Override
    public Event toEntity(EventCreateRequest dto) {
        if ( dto == null ) {
            return null;
        }

        Event event = new Event();

        event.setTitle( dto.getTitle() );
        event.setDescription( dto.getDescription() );
        event.setDateTime( dto.getDateTime() );
        event.setTotalTickets( dto.getTotalTickets() );
        event.setCoverUrl( dto.getCoverUrl() );

        return event;
    }

    @Override
    public EventResponse toDto(Event entity) {
        if ( entity == null ) {
            return null;
        }

        EventResponse eventResponse = new EventResponse();

        eventResponse.setId( entity.getId() );
        eventResponse.setTitle( entity.getTitle() );
        eventResponse.setDescription( entity.getDescription() );
        eventResponse.setDateTime( entity.getDateTime() );
        eventResponse.setTotalTickets( entity.getTotalTickets() );
        eventResponse.setCoverUrl( entity.getCoverUrl() );

        eventResponse.setAvailableTickets( entity.getAvailableTickets() );

        return eventResponse;
    }

    @Override
    public void updateEntityFromDto(EventUpdateRequest dto, Event entity) {
        if ( dto == null ) {
            return;
        }

        entity.setTitle( dto.getTitle() );
        entity.setDescription( dto.getDescription() );
        entity.setDateTime( dto.getDateTime() );
        entity.setTotalTickets( dto.getTotalTickets() );
        entity.setCoverUrl( dto.getCoverUrl() );
    }
}
