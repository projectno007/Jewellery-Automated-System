package com.shop.jewellery.api;

import com.shop.jewellery.entity.Record;
import com.shop.jewellery.service.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.net.URISyntaxException;
import java.util.List;

@RestController
@RequestMapping("/api/v2/record")
public class RecordController {
    private final RecordService recordService;

    @Autowired
    public RecordController(RecordService recordService) {
        this.recordService = recordService;
    }

    @GetMapping("/all")
    List<Record> getAllAdmins(){
        return this.recordService.getAllRecords();
    }

    @PostMapping("/add")
    ResponseEntity<Record> addNewAdmin(@Validated @RequestBody Record record) throws URISyntaxException {
        return this.recordService.addNewAdmin(record);
    }

}
