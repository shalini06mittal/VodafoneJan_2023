package oops;

// user defined data type or blueprint or template
public class Customer {

	// attributes or characteristics or data members or instance variables 
	private String name;
	private String email;
	private String password;

	/*
	 * displayName is not taking any input
	 * but returning some output using the return keyword
	 */
	String displayName()
	{
		/*
		 * current time am or pm 
		 */
		String am = "am";
		if(am.equals("am"))
			return "Good Morning "+ Character.toUpperCase(name.charAt(0)) + name.substring(1) ;
		return "Good Evening "+ Character.toUpperCase(name.charAt(0)) + name.substring(1) ;


	}
	String displayEmail() {
		return email;
	}

	// a function with a name initialize that
	// returns nothing hence void
	// now needs input(parameters in the () ) to take the values from the user
	// and assign them to the instance variables of the class 
	public void initialize(String em, String nm)// em =m
	{
		// BL
		if(em.contains("@"))
			email=em;
		else
			System.out.println("email is wrong");
		name=nm;
	}

}
