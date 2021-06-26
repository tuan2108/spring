package com.example.demo.service;

import com.example.demo.dto.NewDTO;

import java.util.List;

public interface INewService {
    NewDTO save(NewDTO newDTO);
//    NewDTO update(NewDTO newDTO);
//    void delete(Long[] ids);
    List<NewDTO> findAll();
}
