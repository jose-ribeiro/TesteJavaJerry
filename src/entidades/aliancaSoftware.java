package entidades;

public class aliancaSoftware {
	
	private String dpartamento;

	public aliancaSoftware(String dpartamento) {
		this.dpartamento = dpartamento;
	}

	private String getDpartamento() {
		return dpartamento;
	}

	private void setDpartamento(String dpartamento) {
		this.dpartamento = dpartamento;
	}
	
	public String nomeDepartamento () {
		return getDpartamento();
	}


}
