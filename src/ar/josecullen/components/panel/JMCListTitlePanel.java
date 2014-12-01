package ar.josecullen.components.panel;

import java.awt.BorderLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

import ar.com.josecullen.interfaces.comp.Configurable;
import ar.com.josecullen.util.RapidFrame;
import ar.josecullen.components.comp.JMCTextListManipulatePanel;

public class JMCListTitlePanel<Value> extends JPanel{
	JPanel pTitulo;
	JLabel lblTitulo;
	JMCTextListManipulatePanel<Value> tlmp;
	
	public JMCListTitlePanel(String title, Configurable<Value> conf) {
		lblTitulo = new JLabel(title);		
		pTitulo = new JPanel();
		pTitulo.add(lblTitulo);
		tlmp = new JMCTextListManipulatePanel<Value>(conf);
		
		setLayout(new BorderLayout());
		add(pTitulo, BorderLayout.NORTH);
		add(tlmp, BorderLayout.CENTER);
	}
	

}
