package br.com.tt.pet.controller.bean;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.com.tt.pet.model.Fornecedor;
import br.com.tt.pet.util.UtilMessage;

@ManagedBean
@SessionScoped
public class FornecedorBean {

	private Fornecedor fornecedor = new Fornecedor();
	private List<Fornecedor> fornecedores = new ArrayList<Fornecedor>();

	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

	public List<Fornecedor> getFornecedores() {
		return fornecedores;
	}

	public void salvar() {
		
		for (Fornecedor fornecedor : fornecedores) {
			if(this.fornecedor.getCnpj().equals(fornecedor.getCnpj())){
				UtilMessage.info("", fornecedor.getNomeFantasia()+" Alterado com sucesso!");
				this.fornecedor = new Fornecedor();
				return;
			}
		}
		fornecedores.add(fornecedor);
		UtilMessage.info("", fornecedor.getNomeFantasia()+" Cadastrado com sucesso!");
		fornecedor = new Fornecedor();
	}

	public void alterar(Fornecedor pFornecedor) {
		fornecedor = pFornecedor;
	}

	public void excluir(Fornecedor pFornecedor) {
		UtilMessage.warn("", fornecedor.getNomeFantasia()+" Foi Excluido!");
		fornecedores.remove(pFornecedor);
	}
	
	public void cancelar() {
		fornecedor = new Fornecedor();
	}

}
