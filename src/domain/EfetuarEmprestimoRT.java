package domain;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

import data.DataPackage;
import data.LeitorDTO;
import data.LivroDTO;
import data.SituacaoLeitorDTO;
import data.EmprestimoDTO;

public class EfetuarEmprestimoRT {
	DataPackage camaDados = new DataPackage();
	List <EmprestimoDTO> nc;
	
	public EfetuarEmprestimoRT() {}
	
	public SituacaoLeitorDTO iniciarEmprestimo(int idLeitor) {
		// TODO Auto-generated method stub
		
		SituacaoLeitorDTO st = null;
		LeitorDTO leitor = camaDados.buscarLeitor(idLeitor);
		nc = camaDados.buscarNConcluidos(idLeitor);
		
		if(nc == null) {
			String nome = leitor.getNome();
			st = new SituacaoLeitorDTO(nome, true);
		}
	
		System.out.println("Nada de errado por aqui.\n");
		return st;
	}
	
	public Date emprestarLivro(int idLivro, List<Integer> emprestimos) {
		Date prazo = null;
		
		LivroDTO livro = camaDados.buscarLivro(idLivro);
		nc = camaDados.buscaEmpLivrosNConcluidos(idLivro);
		if(nc == null) {
			emprestimos.add(idLivro);
			prazo = new Date();
			LocalDateTime.from(prazo.toInstant()).plusDays(30);
		}
		return prazo;
	}

	public void encerrarEmprestimo(int idLeitor, List<Integer> emprestimos) {
		// TODO Auto-generated method stub
		for(int idLivro:emprestimos){
			LivroDTO livro = camaDados.buscarLivro(idLivro);
			nc = camaDados.buscaEmpLivrosNConcluidos(idLivro);
			if (nc == null) {
				Date prazo = new Date();
				LocalDateTime.from(prazo.toInstant()).plusDays(30);
				camaDados.armazenarEmprestimoLivro(idLeitor, idLivro, LocalDateTime.now(), prazo);
			}
		}
	}
}
