package com.example.demo.service.impl;

import com.example.demo.converter.NewConverter;
import com.example.demo.dto.NewDTO;
import com.example.demo.entity.NewEntity;
import com.example.demo.repository.NewRepository;
import com.example.demo.service.INewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class NewService implements INewService {
    @Autowired
    private NewRepository newRepository;

    @Autowired
    private NewConverter newConverter;

    @Override
    public NewDTO save(NewDTO newDTO){
        NewEntity newEntity = new NewEntity();
        if(newDTO.getId() != null){
            NewEntity oldNewEntity = newRepository.getOne(newDTO.getId());
            newEntity = newConverter.toEntity(newDTO, oldNewEntity);
        }else {
            newEntity = newConverter.toEntity(newDTO);
        }
        newEntity = newRepository.save(newEntity);
        return newConverter.toDTO(newEntity);
    }

//    @Override
//    public NewDTO update(NewDTO newDTO){
//        NewEntity oldNewEntity = newRepository.findOne(newDTO.getId());
//        NewEntity newEntity = newConverter.toEntity(newDTO, oldNewEntity);
//        newEntity = newRepository.save(newEntity);
//        return newConverter.toDTO(newEntity);
//    }

//    @Override
//    public void delete(Long[] ids){
//        for(Long item: ids){
//            newRepository.delete(item);
//        }
//    }

    @Override
    public List<NewDTO> findAll(){
        List<NewDTO> results = new ArrayList<>();
        List<NewEntity> entities = newRepository.findAll();
        for(NewEntity item: entities){
            NewDTO newDTO = newConverter.toDTO(item);
            results.add(newDTO);
        }
        return results;
    }
}
