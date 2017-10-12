package proxypattern.example1;

import proxypattern.example1.businessObjects.BancoUsuarios;
import proxypattern.example1.businessObjects.BancoUsuariosProxy;

public class Cliente {
	
	public static void main(String[] args) {
		BancoUsuarios admin = new BancoUsuariosProxy("admin", "admin");
		System.out.println(admin.getNumeroDeUsuarios());
		System.out.println(admin.getUsuariosConectados());
		
		BancoUsuarios samuel = new BancoUsuariosProxy("samuel", "123456");
		System.out.println(samuel.getNumeroDeUsuarios());
		System.out.println(samuel.getUsuariosConectados());
	}
}
