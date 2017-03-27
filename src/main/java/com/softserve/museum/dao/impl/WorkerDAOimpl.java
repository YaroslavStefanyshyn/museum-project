package com.softserve.museum.dao.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.softserve.museum.dao.WorkerDAO;
import com.softserve.museum.domain.Worker;

@Repository
@Transactional
public class WorkerDAOimpl extends AbstractDAO<Worker, Integer> implements WorkerDAO {

	protected WorkerDAOimpl() {
		super(Worker.class);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Worker> findWorkerByName(String name) {
		Criteria criteria = sessionFactory.getCurrentSession().createCriteria(Worker.class);
		criteria.add(Restrictions.eq("first_name", name));
		
		return criteria.list();
	}

}
