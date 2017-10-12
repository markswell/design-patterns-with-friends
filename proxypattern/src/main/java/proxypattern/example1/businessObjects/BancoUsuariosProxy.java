package proxypattern.example1.businessObjects;

import proxypattern.example1.exceptions.UsuarioSemAcessoException;

public class BancoUsuariosProxy extends BancoUsuarios{

	protected String usuario, senha;
	  
	public BancoUsuariosProxy(String usuario, String senha) {
	    this.usuario = usuario;
	    this.senha = senha;
	}
	
	@Override
	public String getNumeroDeUsuarios() {
		if(temPermissao())
			return super.getNumeroDeUsuarios();
		throw new UsuarioSemAcessoException();
	}
	

	@Override
	public String getUsuariosConectados() {
		if(temPermissao())
			return super.getUsuariosConectados();
		throw new UsuarioSemAcessoException();
	}
	
	private boolean temPermissao() {
		return usuario == "admin" && senha == "admin";
	}
}
