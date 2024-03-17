package com.shop.jewellery.service.impl;

import com.shop.jewellery.entity.Record;
import com.shop.jewellery.repository.RecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

@Service
public class RecordService implements com.shop.jewellery.service.IRecordService {
    private RecordRepository recordRepository;

    @Autowired
    public RecordService(RecordRepository recordRepository) {
        this.recordRepository = recordRepository;
    }

    @Override
    public List<Record> getAllRecords() {
        return this.recordRepository.findAll();
    }

    @Override
    public ResponseEntity<Record> addNewAdmin(Record record) throws URISyntaxException {
        Record result = this.recordRepository.save(record);
        return ResponseEntity.created(new URI("/add" + result.getId())).body(result);
    }


}
