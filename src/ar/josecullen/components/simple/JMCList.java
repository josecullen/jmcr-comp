package ar.josecullen.components.simple;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JList;

import ar.com.josecullen.interfaces.Listable;
import ar.com.josecullen.util.RapidFrame;
import ar.josecullen.model.ListModelImpl;

public class JMCList<Value> extends JList{

	private Listable lis;
	private ListModelImpl listModel;
	
	
	public JMCList(Listable lis){
		super(new ListModelImpl<Value>(lis.getList()));
		this.lis = lis;
		listModel = (ListModelImpl)getModel();		
	}
	
	public void refreshList(){
		listModel = new ListModelImpl<Value>(lis.getList());
		setModel(listModel);
	}
	
	
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("JOs");
		
		Listable<String> lis = new Listable<String>() {
			
			@Override
			public List<String> getList() {
				return list;
			}
		};
		
		RapidFrame frame = new RapidFrame(new JMCList<String>(lis));
	}
}
