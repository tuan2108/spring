package com.example.demo.api.output;

import com.example.demo.dto.NewDTO;

import java.util.ArrayList;
import java.util.List;

public class NewOutput {
    public List<NewDTO> getListResult() {
        return listResult;
    }

    public void setListResult(List<NewDTO> listResult) {
        this.listResult = listResult;
    }

    private List<NewDTO> listResult = new ArrayList<>();
}
