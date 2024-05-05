package org.example.ejercicio2.Classes;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {
    public static UserDto toDto(User user){
        if(user==null){
            return null;
        }
        UserDto userDto = new UserDto(user.getNombre(), user.getPrimerApellido(), user.getSegudoApellido(), user.getEmail(), user.getFechaNaciento());
        return userDto;
    };
}
