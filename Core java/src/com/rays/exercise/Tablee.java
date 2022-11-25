package com.rays.exercise;

public class Tablee {
public  void main(String[] args) {
	int []table=new int[1];
	int a=2;
	System.out.println("inserting...values..");
	for(int i=0;i<table.length;i++) {
	table[i]=a;
	a=a+2;

}
	System.out.println("output....//");
	for(int i:table) {
		System.out.println(i);
	}

}
}



