package com.AcmeFresh.project.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AcmeFresh.project.Model.Modern_Techniques;
import com.AcmeFresh.project.repository.Modern_Tech_Repo;

@Service
public class Modern_Tech_S implements Modern_Tech_I {
	
	
	@Autowired
	private Modern_Tech_Repo mt;
	
	@Override
	public Modern_Techniques addTech(Modern_Techniques tech) {
		
		return mt.save(tech);
		
		
	}

	@Override
	public Modern_Techniques getTechList(Integer id) {
		Optional<Modern_Techniques> list = mt.findById(id);
		if(list.isPresent()) {
			return list.get();
		}
		
		return null;
	}

}
