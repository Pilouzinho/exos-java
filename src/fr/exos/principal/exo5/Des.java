package fr.exos.principal.exo5;

import java.util.Random;

public class Des {
	private int nbreFaces;
	private int resultLance;
	Random random = new Random();
	
	public Des() {
		this.nbreFaces = 6;
	}
	
	public Des(int nbreFaces) {
		this.nbreFaces = nbreFaces;
	}
	
	
	
	public int getNbreFaces() {
		return nbreFaces;
	}
	public void setNbreFaces(int nbreFaces) {
		this.nbreFaces = nbreFaces;
	}
	public int getResultLance() {
		return resultLance;
	}
	public void setResultLance(int resultLance) {
		this.resultLance = resultLance;
	}
	
	
	public int lance() {
		return this.resultLance = (int) (Math.random()*( this.nbreFaces - 1 + 1 ) ) + 1;
		
	}
	
	
}
