class Except6 
{
	public static void main(String[] args) 
	{
      try{
		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);
		int z = x / y;
		System.out.println(x + " / " + y + " = " + z);
      }
	  catch(Exception ex){
		  System.out.println("in catch block");
		  System.out.println("message = " + ex.getMessage());
		  System.out.println("toString() = " + ex.toString());

		  System.out.println();
		  ex.printStackTrace(); //toString() + callstack
		  System.out.println();

		  if(ex instanceof NumberFormatException){
			  System.out.println("------------- PROVIDE ONLY NUMBERS ------------");
		  }
	  }

	  System.out.println("---- done ----");
	}
}
