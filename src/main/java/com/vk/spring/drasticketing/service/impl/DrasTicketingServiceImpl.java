package com.vk.spring.drasticketing.service.impl;

import com.vk.spring.drasticketing.dao.DrasTicketingDao;
import com.vk.spring.drasticketing.service.DrasTicketingService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class DrasTicketingServiceImpl implements DrasTicketingService {

    private static final Logger LOG = LoggerFactory.getLogger(DrasTicketingService.class);

    @Autowired
    DrasTicketingDao drasTicketingDao;

    @Transactional(readOnly = false)
    public void insertIntoRcotrnfildat(String contents){
        LOG.info("Contents are= "+contents);
        drasTicketingDao.insertIntoRcotrnfildat(contents);

    }
    
}