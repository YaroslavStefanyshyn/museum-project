package com.softserve.museum.dao;

import java.util.List;

import com.softserve.museum.domain.Author;
import com.softserve.museum.domain.Exhibit;
import com.softserve.museum.domain.Hall;
import com.softserve.museum.domain.Worker;

public interface ExhibitDAO extends GenericDAO<Exhibit, Integer> {

	 List<Exhibit> findExhibitsByAuthor(Author author);
	
	 List<Exhibit> findExhibitsByMaterial(String material);
	
	List<Exhibit> findExhibitsByTechnique(String technique);
	
	List<Exhibit> findExhibitsByWorker(Worker worker);
	
	List<Exhibit> findExhibitsByHall(Hall hall);

}
