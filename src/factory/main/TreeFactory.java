package factory.main;

/**
 * @author  Saif
 *
 * @date	Nov 23, 2015
 *
 * @file	TreeFactory.java
 *
 */
public class TreeFactory {

	public ITree getTree(String treeType){
		if(treeType.equalsIgnoreCase("Mango")){
			return new MangoTree();
		}
		
		else if(treeType.equalsIgnoreCase("Coconut")){
			return new CoconutTree();
		}
		else{
			System.out.println("Sorry no tree is selected!");
			
			return null;
		}
	}
}
