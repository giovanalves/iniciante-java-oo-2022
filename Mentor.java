package movimento_codar;

public class Mentor {

	String criardesafio;
	String revisardesafio;
	String criarevento;
	String corrigirdesafio;	
	String eventoMentoria;
	String responderPerguntas;
	private Pessoa pessoa;
	
	 public Pessoa getPessoa() {
			return pessoa;
		}

		public void setPessoa(Pessoa pessoa) {
			this.pessoa = pessoa;
		}
		
	
		public void criarevento (String criarevento) {
	        criarevento = new String(criarevento);
	        return;
	    }
		
		public void criardesafio (String criardesafio) {
	        criardesafio = new String(criardesafio);
	        return;
	    }
		
		public void revisardesafio (String revisardesafio) {
			revisardesafio = new String(revisardesafio);
	        return;
		
	}
		
		public void corrigirdesafio (String corrigirdesafio) {
			corrigirdesafio = new String(corrigirdesafio);
	        return;
		}
	        
	    public void eventoMentoria (String eventoMentoria) {
	    	eventoMentoria = new String (eventoMentoria);
		    return;
	    }
		
		public void responderPerguntas (String responderPerguntas) {
			responderPerguntas = new String (responderPerguntas);
			return;
	
	}
}
