package sort;
//creating package name as sort

public class Sorting {
	//creating class name as Sorting 

	public static void main(String[] args) {
		//creating main method
		
			//Creating a string type  
			 String Strng1 = new String("My name is Uma Maheshwari");
		      System.out.println("The given Output is :" );
		      //as it gives the output as word sorted form      
		      //By using  for each loop  to traverse array 
		      //for(data_type variable : array | collection){}  
		      for (String retrival: Strng1.split(" ")) {
		         System.out.println(retrival);
		      }
		      //Creating another string 
		         String Strng2 = new String("M-y-n-a-m-e-i-s-U-m-a-M-a-h-e-s-h-w-a-r-i ");
		         System.out.println("Required Output is :");
		         //Applying for each loop
		         for(String stg:Strng2.split("-")){
		        	 System.out.println(stg);//prints the result

		         }
	}

}
