import java.util.Date;
import java.util.List;

import data.SituacaoLeitorDTO;
import domain.EfetuarEmprestimoRT;

public class Fronteira {
	static EfetuarEmprestimoRT roteiro = new EfetuarEmprestimoRT();
	static List<Integer> emprestimos = null;
	
	public static void main(String[] args) {
		
		int idLeitor = 5;
		
		SituacaoLeitorDTO st = roteiro.iniciarEmprestimo(idLeitor);
		
		int idLivro = 0;
		boolean novoLivro = true;
		
		while(novoLivro) {
			emprestarLivro(idLivro, idLeitor);
			//botando a condição de parada depois de 1 loop por enquanto.
			novoLivro = false;
			
		}
		
		emprestarLivro(-1, idLeitor);
		
	}
	
	public static void emprestarLivro(int idLivro, int idLeitor) {
		if(idLivro > -1) {
			Date dataDev = roteiro.emprestarLivro(idLivro, emprestimos);
		}else {
			roteiro.encerrarEmprestimo(idLeitor, emprestimos);
		}

		
	}
}
