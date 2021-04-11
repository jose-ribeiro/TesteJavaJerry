package entidades;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entidades.enums.nivelFuncionario;

public class funcionario {
	
	private String nome;
	private nivelFuncionario nivel;
	private Double baseSalario;
	
	private aliancaSoftware departamentoFuncionario;
	private List<horasDeContrato> contratos = new ArrayList<>();
	
	public funcionario(String nome, nivelFuncionario nivel, Double baseSalario, aliancaSoftware departamentoFuncionario) {
		this.nome = nome;
		this.nivel = nivel;
		this.baseSalario = baseSalario;
		this.departamentoFuncionario = departamentoFuncionario;
		
				
		
	}

	private String getNome() {
		return nome;
	}

	private void setNome(String nome) {
		this.nome = nome;
	}

	private nivelFuncionario getNivel() {
		return nivel;
	}

	private void setNivel(nivelFuncionario nivel) {
		this.nivel = nivel;
	}

	private Double getBaseSalario() {
		return baseSalario;
	}

	private void setBaseSalario(Double baseSalario) {
		this.baseSalario = baseSalario;
	}

	private aliancaSoftware getDepartamentoFuncionario() {
		return departamentoFuncionario;
	}

	private void setDepartamentoFuncionario(aliancaSoftware departamentoFuncionario) {
		this.departamentoFuncionario = departamentoFuncionario;
	}

	private List<horasDeContrato> getContratos() {
		return contratos;
	}

	
	public void adicionarContrato(horasDeContrato contrato) {
		contratos.add(contrato);
	}
	
	public void removerContrato(horasDeContrato rContrato) {
		contratos.remove(rContrato);
		
	}
	
	public String pegaNome() {
		return getNome();
	}
	
	
	public aliancaSoftware nomeDepartamento() {
		return departamentoFuncionario;		
	}
	public double calculoContrato (int ano, int mes){
		double soma = baseSalario;
		Calendar calendario = Calendar.getInstance();
		for(horasDeContrato c: contratos) {
			calendario.setTime(c.pegaData());
			int c_ano = calendario.get(Calendar.YEAR);
			int c_mes = 1 + calendario.get(Calendar.MONTH);  
			if(ano == c_ano && mes == c_mes) {
				soma += c.valorHorasContrato();
			}
			
		}
		return soma;
		
	}
		
	
	

}
