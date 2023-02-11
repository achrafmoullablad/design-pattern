package tp2;

public abstract class Component {
	protected String name;
	protected int level;
	
	public Component(String name) {
		this.name = name;
	}
	
	public abstract void view();
	
	public String indentation() {
		String str = "";
		for (int i = 0; i < level; i++) {
			str+="----";
		}
		return str;
	}
}
