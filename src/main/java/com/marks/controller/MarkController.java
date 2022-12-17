package com.marks.controller;

import com.marks.dto.MarkDTO;
import com.marks.dto.MarkSearchRQ;
import com.marks.service.MarkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class MarkController {

    @Autowired
    private MarkService markService;

    @PostMapping("/getMarks")
    public List<MarkDTO> getAllScores(@RequestBody MarkSearchRQ searchRQ) {
        return markService.getMarks(searchRQ);
    }
}
