package com.softserve.museum.dao.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.softserve.museum.dao.HallDAO;
import com.softserve.museum.domain.Hall;

@Repository
@Transactional
public class HallDAOimpl extends AbstractDAO<Hall, Integer> implements HallDAO {

	protected HallDAOimpl() {
		super(Hall.class);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Hall> findHallByName(String hall) {
		Criteria criteria = sessionFactory.getCurrentSession().createCriteria(Hall.class);
		criteria.add(Restrictions.eq("name", hall));
		return criteria.list();
	}

}
