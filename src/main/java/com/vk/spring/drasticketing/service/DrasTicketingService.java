package com.vk.spring.drasticketing.service;

import com.vk.spring.drasticketing.dto.InputRequestVo;
import com.vk.spring.drasticketing.dto.ResponseInformationVo;

public interface DrasTicketingService {

    void insertIntoRcotrnfildat(InputRequestVo request);
    
    boolean checkIfDataIsPresent();

    ResponseInformationVo invokeStoredProcedure();
}