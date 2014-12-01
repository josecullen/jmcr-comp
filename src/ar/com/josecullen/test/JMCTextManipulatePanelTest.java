package ar.com.josecullen.test;

import java.util.ArrayList;

import ar.com.josecullen.interfaces.Manipulable;
import ar.com.josecullen.interfaces.Obtainable;
import ar.com.josecullen.util.RapidFrame;
import ar.josecullen.components.comp.JMCTextManipulatePanel;

public class JMCTextManipulatePanelTest {
	
	public static void testWithString(){
		ArrayList<String> list = new ArrayList<String>();
		list.add("Hola");
		
		Obtainable obt = new Obtainable() {
			
			@Override
			public void setValue(Object value) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public Object getValue() {
				return list.get(0);
			}
		};
		
		Manipulable man = new Manipulable() {
			
			@Override
			public void removeValue(Object value) {
				for(String s : list){
					if(s.equals(value)){
						list.remove(s);	
						System.out.println(list);
						return;
					}
				}				
			}
			
			@Override
			public void editValue(Object value) {
				for(String s : list){
					if(s.equals(value)){
						list.remove(s);
						s = s+" edited";
						list.add(s);						
						System.out.println(list);
						return;
					}
				}				
			}
			
			@Override
			public void addValue(Object value) {				
				list.add(value.toString());
				System.out.println(list);
			}
		};
		
		JMCTextManipulatePanel tmp = new JMCTextManipulatePanel(man);
		RapidFrame frame = new RapidFrame(tmp);
		
	}
	
	
	
	
	public static void main(String[] args) {
		testWithString();
	}
}
