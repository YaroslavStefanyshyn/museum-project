package com.softserve.museum.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softserve.museum.dao.AuthorDAO;
import com.softserve.museum.dao.ExhibitDAO;
import com.softserve.museum.dao.HallDAO;
import com.softserve.museum.dao.WorkerDAO;
import com.softserve.museum.domain.Author;
import com.softserve.museum.domain.Exhibit;
import com.softserve.museum.domain.Hall;
import com.softserve.museum.domain.Worker;
import com.softserve.museum.service.ExhibitService;

@Service
public class ExhibitServiceImpl implements ExhibitService {

	@Autowired
	private ExhibitDAO exhibits;

	@Autowired
	private AuthorDAO authors;
	
	@Autowired
	private WorkerDAO workers;
	
	@Autowired
	private HallDAO halls;

	@Override
	public Integer save(Exhibit exhibit) {
		return exhibits.save(exhibit);
	}

	@Override
	public Exhibit update(Exhibit exhibit) {
		return exhibits.update(exhibit);
	}

	@Override
	public void delete(Exhibit exhibit) {
		exhibits.update(exhibit);
	}

	@Override
	public List<Exhibit> listExhibits() {
		return exhibits.getAll();
	}
	
	public List<Exhibit> findExhibitsByAuthor(String author) {
		List<Author> list = authors.findAuthorByName(author);
		
		if (list == null || list.size() > 1) {
            return null;
        }
        return exhibits.findExhibitsByAuthor(list.get(0));
		
	}

	@Override
	public List<Exhibit> findExhibitsByMaterial(String material) {
		
		return exhibits.findExhibitsByMaterial(material);
		
	}

	@Override
	public List<Exhibit> findExhibitsByTechnique(String technique) {
		
		return exhibits.findExhibitsByTechnique(technique);
	}

	@Override
	public List<Exhibit> findExhibitsByWorker(String worker) {
		List<Worker> list = workers.findWorkerByName(worker);

		if (list == null || list.size() < 1) {
			return null;
		}
		return exhibits.findExhibitsByWorker(list.get(0));
	}

	@Override
	public List<Exhibit> findExhibitsByHall(String hall) {
		List<Hall> list = halls.findHallByName(hall);

		if (list == null || list.size() < 1) {
			return null;
		}
		return exhibits.findExhibitsByHall(list.get(0));
	}

}
