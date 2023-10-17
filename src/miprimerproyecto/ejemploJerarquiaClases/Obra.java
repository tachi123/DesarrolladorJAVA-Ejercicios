package miprimerproyecto.ejemploJerarquiaClases;

public abstract class Obra {
	
	private String titulo;
	private String autor;
	
	public abstract void costo();
	
	public Obra(String titulo, String autor) {
		this.titulo = titulo;
		this.autor = autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}
		
	public String getAtributos() {
		return "El autor de \""+titulo+"\" es " + autor; 
	}
	
}
