package org.example.ejercicio2.Service;

import jakarta.transaction.Transactional;
import org.example.ejercicio2.Classes.UserDto;
import org.example.ejercicio2.Classes.UserMapper;
import org.example.ejercicio2.Repository.UserCustomRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class UserService {
    @Autowired
    private UserCustomRepository userCustomRepository;
    @Autowired
    private UserMapper userMapper;

    public List<UserDto> findAll(){

        ArrayList<UserDto> usersDto = new ArrayList<>();
        userCustomRepository.findAll().forEach(user->{
            usersDto.add(userMapper.toDto(user));
        });
        return usersDto;
    }


}
