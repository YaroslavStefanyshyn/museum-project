package com.softserve.museum.service;

import java.util.List;

import com.softserve.museum.domain.Excursion;

public interface ExcursionService {
	public abstract Integer save(Excursion exursion);
	   
    public abstract Excursion update(Excursion excursion);
   
    public abstract void delete(Excursion excursion);

    public abstract List<Excursion> listExcursions();


}
