import java.util.Date;

import data.SituacaoLeitorDTO;
import domain.EfetuarEmprestimoRT;

public class Fronteira {
	public static void main(String[] args) {
		
		EfetuarEmprestimoRT roteiro = new EfetuarEmprestimoRT();
		int idLeitor = 5;
		
		SituacaoLeitorDTO st = roteiro.iniciarEmprestimo(idLeitor);
		
		boolean novoLivro = true;

		while(novoLivro) {
			Date dataDev;
			
		}
	}
}
