package com.infinite.Agentproject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.infinite.Agentproject.ConnectionHelper;
import com.infinite.Agentproject.Agent;

@ManagedBean
@SessionScoped
public class AgentDAO {
	Connection connection;
	PreparedStatement pst;
	
	public String updateAgent(Agent agentNew) throws ClassNotFoundException, SQLException{
		Agent  agent = searchAgent(agentNew.getAgentId());
		if(agent!=null){
			String cmd = "update Agent set agentId=?,firstname=?,lastname=?,city=?,premium=?+"
					+ "premium=? where agentId=?";
			pst = connection.prepareStatement(cmd);
			pst.setString(1, agent.getFirstname());
			pst.setString(2, agent.getLastname());
			pst.setString(3,agent.getCity());
			pst.setDouble(4, agent.getPremium());
			pst.executeUpdate();
			return "Agent record Inserted..";
			
		}
		return "record not found";

	}

	public String deleteAgent(int agentId)throws ClassNotFoundException,SQLException{
		Agent agent=searchAgent(agentId);
	if(agent!=null){
		connection = ConnectionHelper.getConnection();
		String cmd = "delete from  Agent where agentId=?";
		pst = connection.prepareStatement(cmd);
		pst.setInt(1, agentId);
		pst.executeUpdate();
		return "Record delete";
	}
	return "record not found";
	}
		
		
		
	public String addagentId(Agent agent)
	throws ClassNotFoundException,SQLException{
		connection = ConnectionHelper.getConnection();
		String cmd = "insert into Agent(agentId,firstname,lastname,city,premium)"+"values(?,?,?,?)";
		pst = connection.prepareStatement(cmd);
		pst.setInt(1, agent.getAgentId());
		pst.setString(2, agent.getFirstname());
		pst.setString(3, agent.getLastname());
		pst.setString(4,agent.getCity());
		pst.setDouble(5, agent.getPremium());
		pst.executeUpdate();
		return "Record Inserted...";
	}

	public Agent searchAgent(int agentId) throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "Select * from Agent where empno=?";
		pst=connection.prepareStatement(cmd);
		pst.setInt(1, agentId);
		ResultSet rs = pst.executeQuery();
		Agent agent = null;
		if(rs.next()){
			agent = new Agent();
			agent.setAgentId(rs.getInt("agentId"));
			agent.setFirstname(rs.getString("firstname"));
			agent.setLastname(rs.getString("lastname"));
			agent.setCity(rs.getString("city"));
			agent.setPremium(rs.getDouble("premium"));
		}
		return agent;
		
	}
	public List<Agent> showAgent() throws SQLException, ClassNotFoundException{
	List<Agent> agentList = new ArrayList<Agent>();
	connection = ConnectionHelper.getConnection();
	String cmd = "Select * from Agent";
	pst = connection.prepareStatement(cmd);
	ResultSet rs = pst.executeQuery();
	 
	Agent agent = null;
	while(rs.next()){
		agent = new Agent();
		agent.setAgentId(rs.getInt("agentId"));
		agent.setFirstname(rs.getString("firstname"));
		agent.setLastname(rs.getString("lastname"));
		agent.setCity(rs.getString("city"));
		agent.setPremium(rs.getDouble("premium"));
		agentList.add(agent);
	}
	return agentList;
	}
}
