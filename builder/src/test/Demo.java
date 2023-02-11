package test;
import service.Director;
import service.IphoneProBuilder;
import service.IphoneProProduct;
import service.IphoneXBuilder;
import service.IphoneXProduct;

public class Demo {

	public static void main(String[] args) {
		System.out.println("***Builder Design Demo***");
		Director director = new Director();
		IphoneXBuilder iphoneXBuilder = new IphoneXBuilder();
		IphoneProBuilder iphoneProBuilder = new IphoneProBuilder();
		
		System.out.println("***Construction Iphone X");
		director.construireIphoneX(iphoneXBuilder);
		IphoneXProduct xProduct = iphoneXBuilder.getIphoneXProduct();
		System.out.println(xProduct);
		
		System.out.println("***Construction Iphone Pro");
		director.construireIphonePro(iphoneProBuilder);
		IphoneProProduct proProduct = iphoneProBuilder.getIphoneProProduct();
		System.out.println(proProduct);
	}

}
