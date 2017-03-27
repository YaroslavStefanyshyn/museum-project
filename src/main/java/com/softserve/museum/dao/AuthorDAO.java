package com.softserve.museum.dao;

import java.util.List;

import com.softserve.museum.domain.Author;

public interface AuthorDAO extends GenericDAO<Author, Integer> {

	public abstract List<Author> findAuthorByName(String name);
}
