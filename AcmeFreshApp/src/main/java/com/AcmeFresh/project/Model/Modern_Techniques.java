package com.AcmeFresh.project.Model;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Modern_Techniques {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer techId;
	
	private String name;
	
	private double price;
	

}
