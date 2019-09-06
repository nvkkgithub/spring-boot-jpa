package com.vk.spring.drasticketing.controller;

import com.vk.spring.drasticketing.dto.InputRequestVo;
import com.vk.spring.drasticketing.service.DrasTicketingService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DrasTicketingController {
    private static final Logger LOG = LoggerFactory.getLogger(DrasTicketingController.class);

    @Autowired
    private DrasTicketingService drasTicketingService;

    @RequestMapping("/health")
    public ResponseEntity<Object> health() {
    	return ResponseEntity.ok("OK");
    }

    @RequestMapping(value = "/processPdfData", method = RequestMethod.POST, consumes = "application/json")
    public ResponseEntity<Object> processPdfData(@RequestBody InputRequestVo request) {
        
        LOG.info("Request="+request.toString());

        drasTicketingService.insertIntoRcotrnfildat(request.getRequest());

    	return ResponseEntity.ok("SUCCESS");

    }
}