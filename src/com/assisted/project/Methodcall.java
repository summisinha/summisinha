package com.assisted.project;

 class Method {

		public int multipynumbers(int a,int b) {
			int z=a*b;
			return z;
		}
 }
		public class Methodcall {
		public static void main(String[] args) {

			Method b=new Method();
			int ans= b.multipynumbers(10,3);
			System.out.println("Multipilcation is :"+ans);
			}


}
