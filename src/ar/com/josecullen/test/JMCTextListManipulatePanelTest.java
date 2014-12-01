package ar.com.josecullen.test;

import java.util.ArrayList;
import java.util.List;

import ar.com.josecullen.interfaces.comp.Configurable;
import ar.com.josecullen.util.RapidFrame;
import ar.josecullen.components.comp.JMCTextListManipulatePanel;

public class JMCTextListManipulatePanelTest {

	public static void testWithObject(){		
		ArrayList<Person> list = new ArrayList<Person>();
		list.add(new Person("Carito"));
		Configurable<Person> conf = new Configurable<Person>() {

			@Override
			public void editValue(Object value) {				
				for(int i = 0; i < list.size(); i++){
					Person p = list.get(i);
					if(p.name.equals(value)){						
						p.name = p.name+" edited";
						System.out.println(list);
						return;
					}
				}
			}

			@Override
			public void addValue(Object value) {
				list.add(new Person(value.toString()));		
				System.out.println(list);
			}

			@Override
			public void removeValue(Object value) {
				for(Person p : list){
					if(p.name.equals(value.toString())) 
						list.remove(p);
					System.out.println(list);
					return;
				}
			}

			@Override
			public List<Person> getList() {
				return list;
			}

			@Override
			public Object getValue() {
				if(list.size() != 0) 
					return list.get(0);
				return null;
			}

			@Override
			public void setValue(Object value) {
				
			}
			
		};
		
		JMCTextListManipulatePanel<Person> tlmp = new JMCTextListManipulatePanel<Person>(conf);
		RapidFrame frame = new RapidFrame(tlmp);
		
	}
	
	
	public static void main(String[] args) {
		testWithObject();
	}
	
	
	
	
	
}
