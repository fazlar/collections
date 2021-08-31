package com.arrayalist;

import java.util.ArrayList;
import java.util.List;

public class Sublist {
	public static void main(String a[]){
	     ArrayList<String> al = new ArrayList<String>();

	     //Addition of elements in ArrayList
	     al.add("Steve");
	     al.add("Justin");
	     al.add("Ajeet");
	     al.add("John");
	     al.add("Arnold");
	     al.add("Chaitanya");

	     System.out.println("Original ArrayList Content: "+al);

	     //Sublist to ArrayList
	     ArrayList<String> al2 = new ArrayList<>(al.subList(1, 4));
	     al2.addAll(al.subList(1, 9));
	     System.out.println("SubList stored in ArrayList: "+al2);

	     //Sublist to List
	     List<String> list = al.subList(1, 4);
	     System.out.println("SubList stored in List: "+list);
	  }
	}