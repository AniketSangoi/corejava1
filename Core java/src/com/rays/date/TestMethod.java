package com.rays.date;

public class TestMethod {
public static void main(String[] args) {
	int[]copyFrom= {1,2,3,4,5,6,7,8,9,10};
	int[]copyTo=new int[8];
	System.arraycopy(copyFrom,1,copyTo, 0,8);
	for(int i:copyTo) {
		System.out.println(i);
	}
}
}
//kha se kha tk ka data lejana he indexing krna hoga
