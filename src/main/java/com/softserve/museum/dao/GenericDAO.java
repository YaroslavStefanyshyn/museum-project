package com.softserve.museum.dao;

import java.util.List;

public interface GenericDAO<T, ID> {

	public abstract T findById(ID id);

	public abstract List<T> getAll();

	public abstract ID save(T entity);

	public abstract T update(T entity);

	public abstract void delete(T entity);
}
