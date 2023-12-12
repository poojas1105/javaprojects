package javaproject;

public class vowels {
	public static void main(String[]args) {
		String s="France";
		String s1=" ";
		s1=s.replaceAll("[a,e,i,o,u]", " ");
		System.out.println("String after removing vowel:"+s1);
	}

}
