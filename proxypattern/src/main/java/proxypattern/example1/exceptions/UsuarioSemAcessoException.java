package proxypattern.example1.exceptions;

public class UsuarioSemAcessoException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	public String getMessage() {
		return "Usuario informado não tem acesso ao banco de dados";
	}

}
