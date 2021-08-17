package utp.misiontic2022.c2.p56.reto4.modelo.vo;

public class Requerimiento_3 {

    // Por hacer
	  private String Constructora;
	  private Double totalSalario;
	  
	  public Requerimiento_3(String Constructora, Double Salario) {
		  this.Constructora = Constructora;
		  this.totalSalario = Salario;
			  
	  }

	public String getConstructora() {
		return Constructora;
	}

	public void setConstructora(String constructora) {
		Constructora = constructora;
	}

	public Double getSalario() {
		return totalSalario;
	}

	public void setSalario(Double salario) {
		totalSalario = salario;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Requerimiento_2 [Constructora=" + Constructora + ", Salario= " + totalSalario +"]";
	}
	  

}
