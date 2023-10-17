package miprimerproyecto.ejemploJerarquiaClases;

public class Libro extends Obra{
	
	private int numeroDePaginas;
	
	public Libro(String titulo, String autor, int numeroPaginas) {
		super(titulo,autor);
		this.numeroDePaginas = numeroPaginas;
	}
	
	public String getAtributos() {
		return super.getAtributos() + "\n El libro tiene "+ numeroDePaginas + " páginas.";
	}

	@Override
	public void costo() {
		
		
	}
	
}
