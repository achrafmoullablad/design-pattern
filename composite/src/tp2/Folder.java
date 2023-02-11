package tp2;

import java.util.ArrayList;
import java.util.List;

public class Folder extends Component{
	List<Component> components = new ArrayList<Component>();
	
	public Folder(String name) {
		super(name);
	}

	@Override
	public void view() {
		String tab = indentation();
		System.out.println(tab+"Folder:"+name);
		for (Component c : components) {
			c.view();
		}
	}
	
	public Component addComponent(Component c) {
		c.level = this.level + 1;
		this.components.add(c);
		return c;
	}
	
	public void removeComponent(Component c) {
		this.components.remove(c);
	}
}
