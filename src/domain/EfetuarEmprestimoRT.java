package domain;

import java.util.Date;
import java.util.List;

import data.DataPackage;
import data.LeitorDTO;
import data.SituacaoLeitorDTO;
import data.EmprestimoDTO;

public class EfetuarEmprestimoRT {
	DataPackage camaDados = new DataPackage();
	
	public EfetuarEmprestimoRT() {}
	
	public SituacaoLeitorDTO iniciarEmprestimo(int idLeitor) {
		// TODO Auto-generated method stub
		
		SituacaoLeitorDTO st = null;
		LeitorDTO leitor = camaDados.buscarLeitor(idLeitor);
		List <EmprestimoDTO> nc = camaDados.buscarNConcluidos(idLeitor);
		
		if(nc == null) {
			String nome = leitor.getNome();
			st = new SituacaoLeitorDTO(nome, true);
		}
	
		System.out.println("Nada de errado por aqui.\n");
		return st;
	}
	
	public Date emprestarLivro(int idLivro, List<Integer> emprestimos) {
		
	}
}
