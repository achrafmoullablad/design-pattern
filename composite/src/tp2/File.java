package tp2;

public class File extends Component{

	public File(String name) {
		super(name);
	}

	@Override
	public void view() {
		String tab = indentation();
		System.out.println(tab+"File:"+name);
	}

}
