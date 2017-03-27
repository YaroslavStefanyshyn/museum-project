package com.softserve.museum.service;

import java.util.List;


import com.softserve.museum.domain.Exhibit;

public interface ExhibitService {
	 	public abstract Integer save(Exhibit exhibit);
	   
	    public abstract Exhibit update(Exhibit exhibit);
	   
	    public abstract void delete(Exhibit exhibit);

	    public abstract List<Exhibit> listExhibits();
	    
	    public abstract List<Exhibit> findExhibitsByAuthor(String author);
	    
	    public abstract List<Exhibit> findExhibitsByMaterial(String material);
	    
	    public abstract List<Exhibit> findExhibitsByTechnique(String technique);
	    
	    public abstract List<Exhibit> findExhibitsByWorker(String worker);
	    
	    public abstract List<Exhibit> findExhibitsByHall(String hall);
	 
}
