package data;

import data.EmprestimoDTO;

import java.util.ArrayList;
import java.util.List;

public class DataPackage {
	public DataPackage() {
		iniciaLista();
	}
	
	private static List<LeitorDTO> listaLeitores = new ArrayList<LeitorDTO>();
	
	public static void iniciaLista(){
		for(int i = 0; i < 10; i++) {
			listaLeitores.add(new LeitorDTO());
			listaLeitores.get(i).setIdLeitor(i);
		}
	}
	
	public LeitorDTO buscarLeitor(int idLeitor) {
		// TODO Auto-generated method stub
		for(int i = 0; i < listaLeitores.size(); i++) {
			if(listaLeitores.get(i).getIdLeitor() == idLeitor) {
				return listaLeitores.get(i);
			}
		}
		return null;
	}

	public List<EmprestimoDTO> buscarNConcluidos(int idLeitor) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public LivroDTO buscarLivro(int idLivro) {}

}
