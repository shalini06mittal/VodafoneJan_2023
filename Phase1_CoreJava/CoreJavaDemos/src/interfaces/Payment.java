package interfaces;

/**
 * 1. interface is a keyword
 * 2. interfaces are by default abstarct
 * 3. interface cannot be instantiated
 * 4. interface methods are by default abstract and public
 * 5. variables are by default public final and static
 * 6. interface can extend other interface
 * 6. classes implements interfaces and either provide the implementation of abstract ,methos
 * or declare itself as abstract
 * 7. any common functionalities across the classes irrespective of the relationship
 * 7. 
 * @author Shalini
 *
 */
public abstract interface Payment extends Notifications{

	 void pay();
	 interface I1{
		 
	 }
}
// cash, card, upi, neft etc