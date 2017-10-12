package proxypattern.example2;

public class Image implements ImageInter{

	private String fileNameImage;
	
	public Image(final String fileNameImage) {
		this.fileNameImage = fileNameImage;
		loadFromDisk(this.fileNameImage);
	}
	
	@Override
	public void showImage() {
		System.out.println("showing " + this.fileNameImage + "\n");
	}
	
	public void loadFromDisk(final String fileNameImage){
		System.out.println("loading " + fileNameImage + "\n");
	}
}
