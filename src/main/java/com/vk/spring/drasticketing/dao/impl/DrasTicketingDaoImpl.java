package com.vk.spring.drasticketing.dao.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.StoredProcedureQuery;

import com.vk.spring.drasticketing.dao.DrasTicketingDao;
import com.vk.spring.drasticketing.dto.InputRequestVo;
import com.vk.spring.drasticketing.dto.ResponseInformationVo;

@Repository
public class DrasTicketingDaoImpl implements DrasTicketingDao {

    private static final Logger LOG = LoggerFactory.getLogger(DrasTicketingDaoImpl.class);

    @PersistenceContext
    private EntityManager em;
    
    public boolean checkIfDataIsPresent(){
        //Query q = em.createNativeQuery("SELECT * FROM TABLE_A p");
        // List results = q.getResultList();
        // LOG.info("results :: "+results);
        
        Query q = em.createNativeQuery("SELECT COUNT(1) FROM dn_t_drs_rcotrnfildat");
        BigDecimal results = (BigDecimal) q.getSingleResult();
        LOG.info("results = "+results.intValue());
        return results.intValue() > 0;
    }

    public int insertIntoRcotrnfildat(InputRequestVo request){
        Query q = em.createNativeQuery("INSERT INTO dn_t_drs_rcotrnfildat(seqnum, trntyp) VALUES (:seqnum, :trntyp)");
        q.setParameter("seqnum", request.getCounter());
        q.setParameter("trntyp", request.getRequest());

        int recordsInserted = q.executeUpdate();

        LOG.debug("recordsInserted="+recordsInserted);
        
        return recordsInserted;
    }
    
    public ResponseInformationVo invokeStoredProcedure(){
        StoredProcedureQuery query = this.em.createNamedStoredProcedureQuery("parsing_process");
        // query.setParameter("p_status", "HI");
        // in-case in parameter for procedure.
        query.execute();
        String status = (String) query.getOutputParameterValue("p_status");
        String message = (String) query.getOutputParameterValue("p_message");

        ResponseInformationVo response = new ResponseInformationVo(status, message);

        LOG.debug("Returning Response = "+response);

        return response;
    }
}