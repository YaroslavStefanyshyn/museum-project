package com.softserve.museum.dao;

import java.util.List;

import com.softserve.museum.domain.Hall;

public interface HallDAO extends GenericDAO<Hall, Integer> {

	public abstract List<Hall> findHallByName(String hall);
}
