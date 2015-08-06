package org.monsterinc.models;

public class KillerVampire implements Vampire{
	
	public KillerVampire(){
		super();
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("Boom !");
	}

	@Override
	public void terrorize() {
		// TODO Auto-generated method stub
		System.out.println("Boo !");
	}

	@Override
	public void kill() {
		// TODO Auto-generated method stub
		System.out.println("Rip.");
	}

	@Override
	public void drinkBlood() {
		// TODO Auto-generated method stub
		System.out.println("Slurp !");
	}

}
