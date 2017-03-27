package com.softserve.museum.dao.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.softserve.museum.dao.AuthorDAO;
import com.softserve.museum.domain.Author;

@Repository
@Transactional
public class AuthorDAOimpl extends AbstractDAO<Author, Integer> implements AuthorDAO {

	protected AuthorDAOimpl() {
		super(Author.class);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Author> findAuthorByName(String name) {
		Criteria criteria = sessionFactory.getCurrentSession().createCriteria(Author.class);
		criteria.add(Restrictions.eq("firstName", name));

		return criteria.list();
		
	}

}