package movimento_codar;

public class teste {
	public static void main(String[] args) {
		Aprendiz x = new Aprendiz();
		Pessoa alexa = new Pessoa();
		alexa.setNome("alexa");
		x.setPessoa(alexa);
		System.out.println(x.getPessoa().getNome());
		
		Aprendiz y = new Aprendiz();
		Pessoa ryan = new Pessoa();
		ryan.setCargo("aprendiz");
		y.setPessoa(ryan);
		System.out.println(y.getPessoa().getCargo());
		
		Organizador j = new Organizador(); 
		j.setCriarevento("evento");
		System.out.println(j.getCriarevento());
		
		Organizador b = new Organizador(); 
		b.setCronograma("cronograma");
		System.out.println(b.getCronograma());
	} 

	
}
