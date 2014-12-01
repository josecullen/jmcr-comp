package ar.com.josecullen.util;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class RapidFrame extends JFrame {
	public RapidFrame(JComponent comp, int w, int h){
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());			        
		} catch (ClassNotFoundException | InstantiationException
				| IllegalAccessException | UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}
		setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(w, h);
        setContentPane(comp);
        setVisible(true);
        
    }
	public RapidFrame(int w, int h){
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());			        
		} catch (ClassNotFoundException | InstantiationException
				| IllegalAccessException | UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}
		setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(w, h);
        setVisible(true);
	}
	
	public RapidFrame(JComponent comp){
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());			        
		} catch (ClassNotFoundException | InstantiationException
				| IllegalAccessException | UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}
		setDefaultCloseOperation(EXIT_ON_CLOSE);
        setContentPane(comp);
        setLocationRelativeTo(null);
        //setExtendedState(JFrame.MAXIMIZED_BOTH); 
        pack();

        setVisible(true);
        
    }
}
