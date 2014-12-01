package ar.josecullen.components.simple;

import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

import ar.com.josecullen.interfaces.Manipulable;

public abstract class AbstractManipulatePanel extends JPanel {
	
	Manipulable man;
	
	public abstract Object getAddValue();
	public abstract Object getRemoveValue();
	public abstract void refresh();
	
	Image imAdd = new ImageIcon(getClass().getResource("/img/add-icon.png")).getImage().getScaledInstance(8, 8, Image.SCALE_AREA_AVERAGING);
    Image imRemove = new ImageIcon(getClass().getResource("/img/remove-icon.png")).getImage().getScaledInstance(8, 8, Image.SCALE_AREA_AVERAGING);

    JButton btnAdd = new JButton("", new ImageIcon(imAdd)),
    		btnRemove = new JButton("", new ImageIcon(imRemove)),
    		btnEdit = new JButton("Edit");
    
    JPanel buttonPanel = new JPanel();
    
    public AbstractManipulatePanel(Manipulable man, boolean add, boolean remove, boolean edit){
    	this.man = man;
    	setLayout(new FlowLayout());
    	if(add) 	add(btnAdd);
    	if(remove) 	add(btnRemove);
    	if(edit)	add(btnEdit);
    	init();
    }
    
    private void init(){
    	btnAdd.addActionListener(add);
    	btnRemove.addActionListener(remove);
    	btnEdit.addActionListener(edit);
    }
    
    
    ActionListener add = new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			man.addValue(getAddValue());	
			refresh();
		}
	};
	ActionListener remove = new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			man.removeValue(getRemoveValue());	
			refresh();
		}
	};
	ActionListener edit = new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			man.editValue(getAddValue());	
			refresh();
		}
	};
    
    
    
    
}
