package com.vk.spring.drasticketing.dao;

import com.vk.spring.drasticketing.dto.InputRequestVo;
import com.vk.spring.drasticketing.dto.ResponseInformationVo;

public interface DrasTicketingDao {

    int insertIntoRcotrnfildat(InputRequestVo request);
    
    boolean checkIfDataIsPresent();

    ResponseInformationVo invokeStoredProcedure();
}