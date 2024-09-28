package com.shop.jewellery.service;

import com.shop.jewellery.entity.Record;
import org.springframework.http.ResponseEntity;

import java.net.URISyntaxException;
import java.util.List;

public interface IRecordService {
    List<Record> getAllRecords();

    ResponseEntity<Record> addNewAdmin(Record record) throws URISyntaxException;
}
