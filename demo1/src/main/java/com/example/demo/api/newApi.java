package com.example.demo.api;

import com.example.demo.api.output.NewOutput;
import com.example.demo.dto.NewDTO;
import com.example.demo.service.INewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class newApi {

    @Autowired
    private INewService newService;

    @PostMapping(value = "/new")
    public NewDTO createNew(@RequestBody NewDTO model){
        return newService.save(model);
    }

    @PutMapping(value = "/new/{id}")
    public NewDTO updateNew(@RequestBody NewDTO model, @PathVariable("id") long id){
        model.setId(id);
        return newService.save(model);
    }

//    @DeleteMapping(value = "/new")
//    public void deleteNew(@RequestBody Long[] ids){
//        newService.delete(ids);
//    }

    @GetMapping(value = "/new")
    public NewOutput showNew(){
        NewOutput result = new NewOutput();
        result.setListResult(newService.findAll());
        return result;
    }

}
