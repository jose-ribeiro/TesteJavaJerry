package entidades;

import java.util.Date;

public class horasDeContrato {
	
	private Date date;
	private Double valorHora;
	private Integer horas;
	
	
	public horasDeContrato(Date date, Double valorHora, Integer horas) {
		this.date = date;
		this.valorHora = valorHora;
		this.horas = horas;
	}


	private Date getDate() {
		return date;
	}


	private void setDate(Date date) {
		this.date = date;
	}


	private Double getValorHora() {
		return valorHora;
	}


	private void setValorHora(Double valorHora) {
		this.valorHora = valorHora;
	}


	private Integer getHoras() {
		return horas;
	}


	private void setHoras(Integer horas) {
		this.horas = horas;
	}
	//delegação
	public double valorHorasContrato() {
		return valorHora * horas;
	}
	
	public Date pegaData() {
		return date;
	}	

}
