package com.garyseven.quickfind;

public class QuickFindUF {

	private int[] id;
	
	public QuickFindUF(int n) {
		
		this.id = new int[n];
		
		for (int i = 0; i < n; i++) {
			this.id[i] = i;
		}
	}
	
	public boolean connected(int p, int q){
		return this.id[p] == this.id[q];
	}
	
	public void union(int p, int q){
		int first = 0;
		int second = 0;
		if (!connected(p, q)){
			if (p < q){ 
				first = id[p];
				second = id[q];
			} 
			else{ 
				first = id[q];
				second = id[p];
			}
			
			for (int i = 0; i < id.length; i++) {
				if(id[i] == second) id[i] = first; 
			}
		}
	}
}