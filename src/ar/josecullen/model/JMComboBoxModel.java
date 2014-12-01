package ar.josecullen.model;

import java.util.List;

import javax.swing.ComboBoxModel;
import javax.swing.event.ListDataListener;

import ar.com.josecullen.interfaces.Listable;

public class JMComboBoxModel<E> implements ComboBoxModel<E> {

	List<E> list;
	E selectedItem;

	public JMComboBoxModel(Listable<E> lis) {
		list = lis.getList();
	}
	
	
	@Override
	public int getSize() {
		return list.size();
	}

	@Override
	public E getElementAt(int index) {
		return list.get(index);
	}

	@Override
	public void addListDataListener(ListDataListener l) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeListDataListener(ListDataListener l) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setSelectedItem(Object anItem) {
		for(E e : list){
			if(e.equals(anItem)){
				selectedItem = e;
				return;
			}
		}
		selectedItem = null;
	}

	@Override
	public Object getSelectedItem() {
		return selectedItem;
	}

}
