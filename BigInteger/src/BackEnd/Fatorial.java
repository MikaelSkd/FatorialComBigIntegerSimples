package BackEnd;

import java.math.BigInteger;

public class Fatorial {
	private int numero;
	
	public Fatorial(int numero) {
		this.numero = numero;
	}
	public Fatorial() {
		
	}
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public BigInteger getFatorial(){
		
		if(this.numero < 0){
	        throw new IllegalArgumentException("");
	    }

	    BigInteger resultado = BigInteger.ONE;
	    
	    for (int i = 2; i <= this.numero; i++) {
	    	resultado = resultado.multiply(BigInteger.valueOf(i));
	    }

	    return resultado;
    }
}
