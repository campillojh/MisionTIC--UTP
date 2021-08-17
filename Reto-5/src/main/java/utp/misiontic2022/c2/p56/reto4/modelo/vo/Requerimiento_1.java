package utp.misiontic2022.c2.p56.reto4.modelo.vo;

public class Requerimiento_1 {

    // Por hacer
	private String Nombre_Material;
	private Double Precio_Unidad;
	private Integer ID_Proyecto;
	
	
	 public Requerimiento_1(String Nombre_Material, Double Precio_Unidad, Integer ID_Proyecto) {
		 this.Nombre_Material = Nombre_Material;
		 this.Precio_Unidad = Precio_Unidad;
		 this.ID_Proyecto = ID_Proyecto;	 
	 }


	public String getNombre_Material() {
		return Nombre_Material;
	}


	public void setNombre_Material(String nombre_Material) {
		Nombre_Material = nombre_Material;
	}


	public Double getPrecio_Unidad() {
		return Precio_Unidad;
	}


	public void setPrecio_Unidad(Double precio_Unidad) {
		Precio_Unidad = precio_Unidad;
	}


	public Integer getID_Proyecto() {
		return ID_Proyecto;
	}


	public void setID_Proyecto(Integer iD_Proyecto) {
		ID_Proyecto = iD_Proyecto;
	}


	@Override
	public String toString() {
		return "Requerimiento_1 [Nombre_Material=" + Nombre_Material + ", Precio_Unidad=" + Precio_Unidad
				+ ", ID_Proyecto=" + ID_Proyecto + "]";
	}
		  

}
