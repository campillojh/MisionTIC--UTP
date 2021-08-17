package utp.misiontic2022.c2.p56.reto4.modelo.vo;

public class Requerimiento_2 {

    // Por hacer
   	

		private String  Proveedor;
    	private Double Ventas;
      
        public Requerimiento_2(String Proveedor, Double Ventas) {
        	this.Proveedor = Proveedor;
        	this.Ventas = Ventas;
        }

		public String getProveedor() {
			return Proveedor;
		}

		public void setProveedor(String proveedor) {
			Proveedor = proveedor;
		}

		public Double getVentas() {
			return Ventas;
		}

		public void setVentas(Double ventas) {
			Ventas = ventas;
		}
         
    	@Override
	   public String toString() {
		// TODO Auto-generated method stub
		  return "Requerimiento_2 [Proveedor=" + Proveedor + ", Ventas= " + Ventas +"]";
	}

}
