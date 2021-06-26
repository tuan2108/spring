package com.example.demo.converter;

import com.example.demo.dto.NewDTO;
import com.example.demo.entity.NewEntity;
import org.springframework.stereotype.Component;

@Component
public class NewConverter {
    public NewEntity toEntity(NewDTO dto){
        NewEntity entity = new NewEntity();
        entity.setUser_name(dto.getUser_name());
        entity.setEmail(dto.getEmail());
        entity.setUser_phone(dto.getUser_phone());
        return entity;
    }

    public NewDTO toDTO(NewEntity entity){
        NewDTO dto = new NewDTO();
        if(entity.getId() != null){
            dto.setId(entity.getId());
        }
        dto.setUser_name(entity.getUser_name());
        dto.setEmail(entity.getEmail());
        dto.setUser_phone(entity.getUser_phone());
        return dto;
    }

    public NewEntity toEntity(NewDTO dto, NewEntity entity){
        entity.setUser_name(dto.getUser_name());
        entity.setEmail(dto.getEmail());
        entity.setUser_phone(dto.getUser_phone());
        return entity;
    }
}
