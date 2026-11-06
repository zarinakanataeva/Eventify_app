package com.example.BookingApp.mapper;

import com.example.BookingApp.dto.request.RegisterRequest;
import com.example.BookingApp.dto.response.AuthorizeResponse;
import com.example.BookingApp.entity.Role;
import com.example.BookingApp.entity.User;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-11-06T15:12:53+0300",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.4.jar, environment: Java 17.0.17 (Microsoft)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public User toEntity(RegisterRequest dto) {
        if ( dto == null ) {
            return null;
        }

        User.UserBuilder user = User.builder();

        user.email( dto.getEmail() );
        user.password( dto.getPassword() );

        user.role( Role.USER );

        return user.build();
    }

    @Override
    public AuthorizeResponse toAuthResponse(User user) {
        if ( user == null ) {
            return null;
        }

        AuthorizeResponse authorizeResponse = new AuthorizeResponse();

        authorizeResponse.setRole( roleToRole( user.getRole() ) );

        return authorizeResponse;
    }

    protected AuthorizeResponse.Role roleToRole(Role role) {
        if ( role == null ) {
            return null;
        }

        AuthorizeResponse.Role role1;

        switch ( role ) {
            case USER: role1 = AuthorizeResponse.Role.USER;
            break;
            case ADMIN: role1 = AuthorizeResponse.Role.ADMIN;
            break;
            default: throw new IllegalArgumentException( "Unexpected enum constant: " + role );
        }

        return role1;
    }
}
