package model;

public class PessoaFisica {
	String nome, endereco, bairro, cep, cidade, estado, telefone, celular, rg, cpf ;
	char sexo;
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public String getnome(){
		return nome;
	}
	
	public void setEndeteco(String endereco){
		this.endereco = endereco;
	}
	
	public String getendereco(){
		return endereco;
	}
	
	public void setBairro(String bairro){
		this.bairro = bairro;
	}
	
	public String getbairro(){
		return bairro;
	}
	
	public void setCEP(String cep){
		this.cep = cep;
	}
	
	public String getcep(){
		return cep;
	}
	
	public void setCidade(String cidade){
		this.cidade = cidade;
	}
	
	public String getcidade(){
		return cidade;
	}
	
	public void setEstado(String estado){
		this.estado = estado;
	}
	
	public String getestado(){
		return estado;
	}
	
	public void setTelefone(String telefone){
		this.telefone = telefone;
	}
	
	public String gettelefone(){
		return telefone;
		
	}
	
	public void setCelular(String celular){
		this.celular = celular;
	}
	
	public String getcelular(){
		return celular;
	}
	
	public void setRg(String rg){
		this.rg = rg;
	}
	
	public String getrg(){
		return rg;
		
	}
	
	public void setCPF(String cpf){
		this.cpf = cpf;
	}
	
	public String getcpf(){
		return cpf;
	}
	
	public void setSexo(char sexo){
		this.sexo = sexo;
	}
	
	public char getsexo(){
		return sexo;
	}
}
