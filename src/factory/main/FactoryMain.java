package factory.main;

public class FactoryMain {

	public static void main(String[] args) {
		TreeFactory treeFactory = new TreeFactory();
		
		ITree mango = treeFactory.getTree("Mango");
		
		ITree coconut = treeFactory.getTree("Coconut");
		
		
		mango.plantTree();
		coconut.plantTree();
	}

}
