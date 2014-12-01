package ar.josecullen.components.simple;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

import javax.swing.JTextField;

import ar.com.josecullen.interfaces.Obtainable;

public class JMCTextField extends JTextField {

	Obtainable value;
	
	public JMCTextField(Obtainable value){
		super(15);
		this.value = value;	
		init();
	}
	public JMCTextField(Obtainable value, int columns){
		super(columns);
		this.value = value;
		init();
	}
	
	public void init(){
		FocusAdapter fa = new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {				
				super.focusLost(e);
				value.setValue(getText());
			}
		};
		addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				value.setValue(getText());
			}
		});
		
		addFocusListener(fa);
		if(value.getValue() != null){
			setText(value.getValue().toString());
		}
	}
	
}
