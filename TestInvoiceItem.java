package com.oops.bll;

public class TestInvoiceItem {
	
	public static void main(String[] args) {
		 InvoiceItem i1=new InvoiceItem("12345","Book",5,500);
	      
	      System.out.println("ID : " + i1.getId());
	      System.out.println("Description : " + i1.getDesc());
	      System.out.println("Quantity : " + i1.getQty());
	      System.out.println("Unit Price : " + i1.getUnitPrice());
	      System.out.println("Total : " + i1.getTotal());
	      System.out.println("**************************************" );
	      i1.setUnitPrice(100);
	      System.out.println("Total : " + i1.getTotal());
	      System.out.println("**************************************" );
	      System.out.println(i1);
	      
	      
	      
	   }


	}


