package org.sample;

public class SampleGit {

	private void method1() {
		System.out.println("Hello I am Test Git");
	}
	
	private void method2(int Id) {
		System.out.println("Git Id"+Id);

	}
	
	public static void main(String[] args) {
		
		SampleGit sa = new SampleGit();
		sa.method1();
		sa.method2(1001);
	}
}
