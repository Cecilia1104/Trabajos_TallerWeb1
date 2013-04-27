package ar.edu.vaio.tallerweb.web1;

public class Test {

	
	public static void main(String[] args) {
		
    Dado dado=new Dado(6);
    dado.tirarDado();
    System.out.println(dado.getValor());
    dado.tirarDado();
    System.out.println(dado.getValor());
    dado.tirarDado();
    System.out.println(dado.getValor());
	}
}
