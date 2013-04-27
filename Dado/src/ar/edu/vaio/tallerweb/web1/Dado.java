package ar.edu.vaio.tallerweb.web1;
import java.util.Random;
public class Dado {
 
	Random rnd= new Random();
	int caras;
	int valor;
	
	Dado(int caras){
		this.caras=caras;
	}
	
	void tirarDado(){
		valor=(int)(Math.random()*this.caras + 1);
	}
	Integer getValor(){
		return valor;
	}
}

	
