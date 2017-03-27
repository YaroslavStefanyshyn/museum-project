package com.softserve.museum.dao;

import java.util.List;

import com.softserve.museum.domain.Worker;

public interface WorkerDAO extends GenericDAO<Worker, Integer> {

	public abstract List<Worker> findWorkerByName(String name);
}
