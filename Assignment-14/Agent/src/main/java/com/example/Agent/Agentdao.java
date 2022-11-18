package com.example.Agent;

import org.springframework.jdbc.core.JdbcTemplate;
public class Agentdao {

	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getjdbcTemplate() {
		return jdbcTemplate;
	}

	public void setjdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public int saveAgent(Agent a)

	{
		String query = "insert into agent(id,name,commisssion) value(?,?,?)";
		return jdbcTemplate.update(query, a.getId(), a.getName(), a.getCommisssion());
	}

	// update agent details
	public int updateAgent(Agent a) {
		String query = "update agent set name='" + a.getName() + "',commisssion='" + a.getCommisssion()
				+ "' where id='" + a.getId() + "' ";
		return jdbcTemplate.update(query);
	}
	
	public int deleteAgent(Agent a) {
		String query = "delete From agent where id='" + a.getId() + "' ";
		return jdbcTemplate.update(query);
	}
}
