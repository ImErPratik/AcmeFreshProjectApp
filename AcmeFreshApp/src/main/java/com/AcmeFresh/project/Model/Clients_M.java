package com.AcmeFresh.project.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "Clients")
public class Clients_M extends UserAbstract {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer clientId;

}
