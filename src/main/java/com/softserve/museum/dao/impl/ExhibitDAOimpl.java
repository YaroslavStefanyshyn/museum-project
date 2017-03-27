package com.softserve.museum.dao.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.softserve.museum.dao.ExhibitDAO;
import com.softserve.museum.domain.Author;
import com.softserve.museum.domain.Exhibit;
import com.softserve.museum.domain.Hall;
import com.softserve.museum.domain.Worker;

@Repository
@Transactional
public class ExhibitDAOimpl extends AbstractDAO<Exhibit, Integer> implements ExhibitDAO{

	protected ExhibitDAOimpl() {
		super(Exhibit.class);
	}


	@SuppressWarnings("unchecked")
	@Override
	public List<Exhibit> findExhibitsByAuthor(Author author) {
		Criteria criteria = sessionFactory.getCurrentSession().createCriteria(Exhibit.class);
		criteria.add(Restrictions.eq("author", author));

		return criteria.list();
	}


	@SuppressWarnings("unchecked")
	@Override
	public List<Exhibit> findExhibitsByMaterial(String material) {
		Criteria criteria = sessionFactory.getCurrentSession().createCriteria(Exhibit.class);
		criteria.add(Restrictions.eq("material", material));
		return criteria.list();
	}


	@SuppressWarnings("unchecked")
	@Override
	public List<Exhibit> findExhibitsByTechnique(String technique) {
		Criteria criteria = sessionFactory.getCurrentSession().createCriteria(Exhibit.class);
		criteria.add(Restrictions.eq("technique", technique));
		return criteria.list();
	}
	
	@SuppressWarnings("unchecked")
	public List<Exhibit> findExhibitsByWorker(Worker worker) {
		Criteria criteria = sessionFactory.getCurrentSession().createCriteria(Exhibit.class);
		criteria.add(Restrictions.eq("worker", worker));
		return criteria.list();
	}


	@SuppressWarnings("unchecked")
	@Override
	public List<Exhibit> findExhibitsByHall(Hall hall) {
		Criteria criteria = sessionFactory.getCurrentSession().createCriteria(Exhibit.class);
		criteria.add(Restrictions.eq("hall",hall));
		return criteria.list();
	}
	
	

}
