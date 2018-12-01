package app;

import javax.swing.JTabbedPane;

/*
 * This class is the core class of the entire Pirex Project
 * The execution, flow and all other client classes are controlled from this class.
 */
public class PirexCore {

	
	public static void main(String[] args) {
		
		//Create the main window
		PirexFrame pirex = new PirexFrame();
		
		//Add all the components: Copied from PirexLoadingTabDriver.java class file
		JTabbedPane jtb = new JTabbedPane();
		jtb.add("Load Document", new PirexLoadingTab());
		pirex.add(jtb);
		
		//Add functionality components

	}

}
