package proxypattern.example2;

public class ImageProxy implements ImageInter{

	private Image realImage;
	private String fileNameImage;
	
	public ImageProxy(final String fileNameImage) {
		this.fileNameImage = fileNameImage;
	}
	
	@Override
	public void showImage() {
		if(realImage == null) {
			realImage = new Image(fileNameImage);
		}
		realImage.showImage();
	}

}
