package com.softserve.museum.dao.impl;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.softserve.museum.dao.ExcursionDAO;
import com.softserve.museum.domain.Excursion;

@Repository
@Transactional
public class ExcursionDAOimpl extends AbstractDAO<Excursion, Integer> implements ExcursionDAO {

	protected ExcursionDAOimpl() {
		super(Excursion.class);
	}

}
