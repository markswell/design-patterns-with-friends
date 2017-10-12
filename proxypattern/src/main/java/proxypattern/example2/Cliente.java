package proxypattern.example2;

import java.util.Arrays;

public class Cliente {

	public static void main(String[] args) {
		
		ImageInter image = new ImageProxy("foto_minha_nua.jpg");
		
		Arrays.asList(1,2,3).forEach(item -> {
			image.showImage();	
		});
	}	
}