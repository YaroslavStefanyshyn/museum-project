package com.softserve.museum.dao.impl;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.softserve.museum.dao.ScheduleDAO;
import com.softserve.museum.domain.Schedule;

@Repository
@Transactional
public class ScheduleDAOimpl extends AbstractDAO<Schedule, Integer> implements ScheduleDAO {

	protected ScheduleDAOimpl() {
		super(Schedule.class);
		// TODO Auto-generated constructor stub
	}

}
