package ar.com.josecullen.test;


import javax.swing.JButton;
import javax.swing.JPanel;

import ar.com.josecullen.interfaces.Obtainable;
import ar.com.josecullen.util.RapidFrame;
import ar.josecullen.components.simple.JMCTextField;

public class JMCTextFieldTest {
	
	private static void getFrame(String title, Obtainable obt){
		JMCTextField jmct = new JMCTextField(obt);
		JButton btn = new JButton("lost focus");
		JPanel panel = new JPanel();
		panel.add(jmct);
		panel.add(btn);
		RapidFrame frame = new RapidFrame(panel, 300, 100);
		frame.setTitle(title);
	}
	
	
	
	
	public static void testWithString() {
		Obtainable obt = new Obtainable() {
			String value = "loco";
			@Override
			public String getValue() {
				System.out.println("value = "+value);
				return value;
			}

			@Override
			public void setValue(Object value) {
				this.value = (String) value;
				System.out.println("value = "+value);
			}			
		};		
		getFrame("Test With Strings", obt);
	}
	
	public static void testWithObject(){
		Obtainable obt = new Obtainable() {
			Person person = new Person("José");
			

			@Override
			public Person getValue() {
				System.out.println("getValue = "+person.name);
				return person;
			}

			@Override
			public void setValue(Object value) {
				person.name = value.toString();
				System.out.println(person.name);
			}			
		};
		getFrame("Test With Object", obt);
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		testWithString();
		testWithObject();		
	}

}

class Person{
	public String name;
	public int age;
	public String toString(){
		return name;
	}
	public Person(String name){
		this.name = name;
	}
}