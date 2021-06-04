package it.polito.tdp.poweroutages.model;

import java.util.ArrayList;
import java.util.List;

import it.polito.tdp.poweroutages.DAO.PowerOutageDAO;

public class Model {
	
	PowerOutageDAO podao;
	
	List <Poweroutages> parziale;
	
	
	
	public Model() {
		podao = new PowerOutageDAO();
		
		parziale= new ArrayList<>();
	}
	
	public List<Nerc> getNercList() {
		return podao.getNercList();
	}
	public List <Poweroutages> getBlackoutLists(){
		
		return podao.getBlackoutList();
	}
	
	public List <Poweroutages> eventiBlackout(){
		
		
		
		
		
		
		return null;
		
		
		
		
		
		
		
	}

}
