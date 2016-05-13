package br.com.tt.pet.controller.bean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.com.tt.pet.model.Pet;
import br.com.tt.pet.util.UtilMessage;

@ManagedBean
@SessionScoped
public class PetBean {

	private Pet pet = new Pet();
	private List<Pet> pets = new ArrayList<Pet>();

	public Pet getPet() {
		return pet;
	}

	public void setPet(Pet pet) {
		this.pet = pet;
	}

	public void salvar() {
		pets.add(pet);
		pet = new Pet();
		UtilMessage.info("Pet Salvo", "Pet Salvo com sucesso");
		System.out.println(pets.size());

	}

	public List<Pet> getPets() {
		return pets;
	}

}
