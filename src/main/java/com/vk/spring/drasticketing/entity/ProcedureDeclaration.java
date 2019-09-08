package com.vk.spring.drasticketing.entity;

import java.io.Serializable;

import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.StoredProcedureParameter;
import javax.persistence.ParameterMode;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@NamedStoredProcedureQuery(
	name = "parsing_process", 
	procedureName = "PKG.STARTPARSE_PROC", //keep actual procedure
	parameters = { 
		@StoredProcedureParameter(mode = ParameterMode.OUT, type = String.class, name = "p_status"), 
		@StoredProcedureParameter(mode = ParameterMode.OUT, type = String.class, name = "p_message")
	}
)
public class ProcedureDeclaration implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

	@Id
	private Integer seqNo;

	private String status;

	private String message;


}