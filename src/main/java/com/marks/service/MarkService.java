package com.marks.service;

import com.marks.dto.MarkDTO;
import com.marks.dto.MarkSearchRQ;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MarkService {
    public List<MarkDTO> getMarks(MarkSearchRQ searchRQ) {
        List<MarkDTO> markDTOList = new ArrayList<>();

        markDTOList.add(new MarkDTO(1, "Dep 1", "S1", 35, "75", "Sam"));
        markDTOList.add(new MarkDTO(2, "Dep 1", "S2", 70, "75", "Smith"));
        markDTOList.add(new MarkDTO(3, "Dep 1", "S3", 60, "75", "Wong"));
        markDTOList.add(new MarkDTO(4, "Dep 1", "S4", 90, "75", "Li"));
        markDTOList.add(new MarkDTO(5, "Dep 2", "S5", 30, "0", "Peter"));
        markDTOList.add(new MarkDTO(6, "Dep 3", "S6", 32, "33.33", "Deewani"));
        markDTOList.add(new MarkDTO(7, "Dep 3", "S7", 70, "33.33", "Messi"));
        markDTOList.add(new MarkDTO(8, "Dep 3", "S8", 20, "33.33", "CR7"));

        return markDTOList;
    }
}
