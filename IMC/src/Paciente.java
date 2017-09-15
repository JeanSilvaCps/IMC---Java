
public class Paciente {
	
	private Double peso, altura, imc;
	
	public Paciente( Double peso, Double altura ) {
		this.setPeso(peso);
		this.setAltura(altura);
	}
	
	private Double calcularIMC() {
		imc = this.getPeso() / ( this.getAltura() * this.getAltura() );
		return imc;
	}
	
	public String diagnostico() {
		Double diag = this.calcularIMC();
		
		if(diag >= 0 && diag < 16) {
			return "Baixo peso muito grave = IMC abaixo de 16 kg/m²";
		}	
		
		if(diag >= 16 && diag <= 16.99) {
			return"Baixo peso grave = IMC entre 16 e 16,99 kg/m²";
		}
		
		if(diag >= 17 && diag <= 18.49) {
			return "Baixo peso = IMC entre 17 e 18,49 kg/m²";
		}
		
		if(diag >= 18.50 && diag <= 24.99) {
			return "Peso normal = IMC entre 18,50 e 24,99 kg/m²";
		}
		
		if(diag >= 25 && diag <= 29.99) {
			return "Sobrepeso = IMC entre 25 e 29,99 kg/m²";
		}
		
		if(diag >= 30 && diag <= 34.99) {
			return "Obesidade grau I = IMC entre 30 e 34,99 kg/m²";
		}
		
		if(diag >= 35 && diag <= 39.99) {
			return "Obesidade grau II = IMC entre 35 e 39,99 kg/m²";
		}
		
		if(diag >= 40) {
			return "Obesidade grau III (obesidade mórbida) = IMC igual ou maior que 40 kg/m²";
		}
		else
		{
			return "Não é possivel calcular o IMC";
		}
		
	}

	private Double getAltura() {
		return altura;
	}

	private void setAltura(Double altura) {
		this.altura = altura;
	}

	private Double getPeso() {
		return peso;
	}

	private void setPeso(Double peso) {
		this.peso = peso;
	}
}


