package tp2;

public class App {

	public static void main(String[] args) {
		Folder root = new Folder("Root");
		Folder f1 = new Folder("Structure");
		Folder f2 = new Folder("Comportement");
		Folder f3 = new Folder("Création");
		root.addComponent(f1);
		root.addComponent(f2);
		root.addComponent(f3);
		f1.addComponent(new File("Composite"));
		f1.addComponent(new File("Decorateur"));
		f2.addComponent(new File("Stategy"));
		f3.addComponent(new File("Singleton"));
		f3.addComponent(new File("Builder"));
		Folder fst1 =(Folder)f1.addComponent(new Folder("St1"));
		fst1.addComponent(new File("Composite Version 2"));
		root.view();
	}
}
