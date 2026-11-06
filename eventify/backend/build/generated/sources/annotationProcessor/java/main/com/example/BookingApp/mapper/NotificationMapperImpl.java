package com.example.BookingApp.mapper;

import com.example.BookingApp.dto.NotificationDto;
import com.example.BookingApp.entity.Notification;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-11-06T15:12:53+0300",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.4.jar, environment: Java 17.0.17 (Microsoft)"
)
@Component
public class NotificationMapperImpl implements NotificationMapper {

    @Override
    public NotificationDto toDto(Notification entity) {
        if ( entity == null ) {
            return null;
        }

        NotificationDto notificationDto = new NotificationDto();

        notificationDto.setNotifyBeforeHours( entity.getHoursBeforeHours() );
        notificationDto.setNotifyNewEvents( entity.getNotifyNewEvents() );
        notificationDto.setNotifyUpcoming( entity.getNotifyUpcoming() );

        return notificationDto;
    }

    @Override
    public void updateEntityFromDto(NotificationDto dto, Notification entity) {
        if ( dto == null ) {
            return;
        }

        entity.setHoursBeforeHours( dto.getNotifyBeforeHours() );
        entity.setNotifyNewEvents( dto.getNotifyNewEvents() );
        entity.setNotifyUpcoming( dto.getNotifyUpcoming() );
    }
}
