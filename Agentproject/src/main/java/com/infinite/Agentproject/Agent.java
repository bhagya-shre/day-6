package com.infinite.Agentproject;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class Agent {
private int agentId;
private String firstname;
private String lastname;
private String city;
private double premium;
@Override
public String toString() {
	return "Agent [agentId=" + agentId + ", firstname=" + firstname + ", lastname=" + lastname + ", city=" + city
			+ ", premium=" + premium + "]";
}
public int getAgentId() {
	return agentId;
}
public void setAgentId(int agentId) {
	this.agentId = agentId;
}
public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public double getPremium() {
	return premium;
}
public void setPremium(double premium) {
	this.premium = premium;
}
public Agent(int agentId, String firstname, String lastname, String city, double premium) {
	super();
	this.agentId = agentId;
	this.firstname = firstname;
	this.lastname = lastname;
	this.city = city;
	this.premium = premium;
}
public Agent() {
	super();
	// TODO Auto-generated constructor stub
}


}
