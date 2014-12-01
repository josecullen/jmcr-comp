package ar.josecullen.components.comp;

import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.JScrollPane;

import ar.com.josecullen.interfaces.comp.Configurable;
import ar.josecullen.components.simple.AbstractManipulatePanel;
import ar.josecullen.components.simple.JMCList;
import ar.josecullen.components.simple.JMCTextField;

public class JMCTableManipulatePanel<Value> extends JPanel{
Configurable<Value> conf;
	
	AbstractManipulatePanel arePanel;
	JMCTextField jmct;
	JMCList<Value> jmcl;
	JScrollPane scroll;
	JPanel southPanel;
	
	public JMCTableManipulatePanel(Configurable conf){
		super();
		jmct = new JMCTextField(conf);
		jmcl = new JMCList<Value>(conf);
		arePanel = new AbstractManipulatePanel(conf, true, true, true) {
			@Override
			public void refresh() {
				jmcl.updateUI();				
			}

			@Override
			public Object getAddValue() {
				return jmct.getText();
			}

			@Override
			public Object getRemoveValue() {
				return jmcl.getSelectedValue();
			}
		};
		
		scroll = new JScrollPane(jmcl);
		southPanel = new JPanel();
		southPanel.add(jmct);
		southPanel.add(arePanel);
		setLayout(new BorderLayout());
		add(scroll, BorderLayout.CENTER);
		add(southPanel, BorderLayout.SOUTH);
		
	}
	
}
