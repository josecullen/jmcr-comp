package ar.josecullen.model;

import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.ListModel;
import javax.swing.event.ListDataListener;


public class ListModelImpl<Value> extends DefaultListModel<Value> {

	List<Value> list;
	
	public ListModelImpl(List list){
		this.list = list;
	}
	
	public void add(Value value){
		list.add(value);
	}
	
	@Override
	public int getSize() {
		return list.size();
	}

	@Override
	public Value getElementAt(int index) {
		return list.get(index);
	}

	@Override
	public void addElement(Value element) {
		list.add(element);
	}
	

}
