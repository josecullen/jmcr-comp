package ar.josecullen.components.simple;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.List;

import javax.swing.JComboBox;

import ar.com.josecullen.interfaces.Listable;
import ar.com.josecullen.interfaces.Obtainable;
import ar.com.josecullen.interfaces.comp.ListObtainable;
import ar.josecullen.model.JMComboBoxModel;

public class JMComboBox<Value> extends JComboBox<Value>  {

	Obtainable obt;
	Listable<Value> lis;
	
	public JMComboBox(Obtainable obt, Listable lis){
		super(new JMComboBoxModel<Value>(lis));
		this.obt = obt;
		this.lis = lis;
		init();
	}
	
	public JMComboBox(ListObtainable listObtainable){
		super(new JMComboBoxModel<Value>(listObtainable));
		obt = listObtainable;
		lis = listObtainable;
		init();
	}

	public void init(){
		setSelectedItem(obt.getValue());
		addItemListener(iListener);
	}
	
	ItemListener iListener = new ItemListener() {		
		@Override
		public void itemStateChanged(ItemEvent e) {
			if(e.getStateChange() == 1){
				obt.setValue( (Value) e.getItem());
			}
		}
	};
	
	

}
