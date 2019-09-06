package com.vk.spring.drasticketing.dao.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.vk.spring.drasticketing.dao.DrasTicketingDao;

@Repository
public class DrasTicketingDaoImpl implements DrasTicketingDao {

    private static final Logger LOG = LoggerFactory.getLogger(DrasTicketingDaoImpl.class);

    @PersistenceContext
    private EntityManager em;
    
    public void insertIntoRcotrnfildat(String contents){
        LOG.info("Entity Manager "+em);

        Query q = em.createNativeQuery("SELECT * FROM TABLE_A p");
        List results = q.getResultList();
        
        LOG.info("results :: "+results);
    }
    
}