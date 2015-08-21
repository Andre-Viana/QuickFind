package com.garyseven.quickfind;

public class Bootstrap {

	public static void main(String[] args) {
		QuickFindUF quickFind = new QuickFindUF(10);
		
		System.out.println(quickFind.connected(0, 6));
		quickFind.union(0, 6);
		System.out.println(quickFind.connected(0, 6));
		
		quickFind.union(0, 2);
		System.out.println(quickFind.connected(2, 6));
		System.out.println(quickFind.connected(0, 6));
	}
}
