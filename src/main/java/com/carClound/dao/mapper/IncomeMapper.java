package com.carClound.dao.mapper;

import com.carClound.annotation.SQL;
import com.carClound.dao.pojo.Income;
import com.carClound.dao.utils.BaseMapper;

import java.util.List;

public class IncomeMapper extends BaseMapper<Income> {
	public IncomeMapper() {
		super(Income.class);
	}

	@SQL("select * from income")
	public List<Income> getIncomeList() {
		Object[] data = new Object[]{"getIncomeList"};
		return selectList(data);
	}
	@SQL("insert into income values(null, #{arg1}, #{arg2}," +
			" #{arg3}, #{arg4}, #{arg5})")
	public void insertIncome(Income income) {
		Object[] data = {
				"insertIncome",
				income.getVehicleId(),
				income.getUserId(),
				income.getDays(),
				income.getAmount(),
				income.getTime(),
		};
		execute(data);
	}
}
