package ar.josecullen.components.comp;

import javax.swing.JPanel;

import ar.com.josecullen.interfaces.Manipulable;
import ar.com.josecullen.interfaces.Obtainable;
import ar.josecullen.components.simple.AbstractManipulatePanel;
import ar.josecullen.components.simple.JMCTextField;

public class JMCTextManipulatePanel extends JPanel {

	JMCTextField jmct;
	AbstractManipulatePanel arePanel;

	Manipulable man;
	Obtainable obt;
	
	
	public JMCTextManipulatePanel(Manipulable man, Obtainable obt, boolean add, boolean remove, boolean edit) {
		super();
		this.man = man;
		this.obt = obt;		
		init(add, remove, edit);
	}
	
	
	private void init(boolean add, boolean remove, boolean edit){
		arePanel = new AbstractManipulatePanel(man, add, remove, edit) {

			@Override
			public void refresh() {	}

			@Override
			public Object getAddValue() {
				return jmct.getText();
			}

			@Override
			public Object getRemoveValue() {
				return jmct.getText();
			}
		};
		
		jmct = new JMCTextField(obt);
		add(jmct);
		add(arePanel);
	}
	
	public JMCTextManipulatePanel(Manipulable man, Obtainable obt) {
		super();
		this.man = man;
		this.obt = obt;
		init(true,true,true);
	}
	public JMCTextManipulatePanel(Manipulable man) {
		super();
		this.man = man;
		
		obt = new Obtainable() {
			@Override
			public void setValue(Object value) {}
			
			@Override
			public Object getValue() {
				return "";
			}
		};
		init(true,true,true);		
	}
	
	
}
