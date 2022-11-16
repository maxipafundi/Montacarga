package unlam.pb2;

public class Articulo {

	private int idArticulo;
	private Integer pesoArticulo;
	
	
	public Articulo(int idArticulo, Integer pesoArticulo) {
		super();
		this.idArticulo = idArticulo;
		this.pesoArticulo = pesoArticulo;
	}


	public int getIdArticulo() {
		return idArticulo;
	}


	public void setIdArticulo(int idArticulo) {
		this.idArticulo = idArticulo;
	}


	public Integer getPesoArticulo() {
		return pesoArticulo;
	}


	public void setPesoArticulo(Integer pesoArticulo) {
		this.pesoArticulo = pesoArticulo;
	}
	
	
	
	
}
