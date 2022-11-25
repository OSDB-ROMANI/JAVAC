package Prova.classi;

public class Persona{
	private String n, m;
	
	public Persona(String n, String m){
		this.n = n;
		this.m = m;
	}
	
	public String stampa(){
		return n+" "+m;
	}
}