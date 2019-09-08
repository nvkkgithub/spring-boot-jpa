package com.vk.spring.drasticketing.service.impl;

import com.vk.spring.drasticketing.dao.DrasTicketingDao;
import com.vk.spring.drasticketing.dto.InputRequestVo;
import com.vk.spring.drasticketing.dto.ResponseInformationVo;
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

    @Transactional(readOnly = true)
    public boolean checkIfDataIsPresent() {
       return drasTicketingDao.checkIfDataIsPresent();
    }

    @Transactional(readOnly = false)
    public void insertIntoRcotrnfildat(InputRequestVo request){
        LOG.info("Contents are= "+request);
        drasTicketingDao.insertIntoRcotrnfildat(request);

    }
    
    @Transactional(readOnly = true)
    public ResponseInformationVo invokeStoredProcedure(){
        return drasTicketingDao.invokeStoredProcedure();
    }
}