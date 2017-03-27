package com.softserve.museum.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softserve.museum.dao.ExcursionDAO;
import com.softserve.museum.domain.Excursion;
import com.softserve.museum.service.ExcursionService;

@Service
public class ExcursionServiceImpl implements ExcursionService{

	@Autowired
	private ExcursionDAO excursions;
	
	@Override
	public Integer save(Excursion exursion) {
		return excursions.save(exursion);
	}

	@Override
	public Excursion update(Excursion excursion) {
		return excursions.update(excursion);
	}

	@Override
	public void delete(Excursion excursion) {
		excursions.delete(excursion);
		
	}

	@Override
	public List<Excursion> listExcursions() {
		// TODO Auto-generated method stub
		return excursions.getAll();
	}


}
