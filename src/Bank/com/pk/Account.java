package Bank.com.pk;

/**
 * this is our Abstarct Class Provoid the different implementations
 * 
 * <b><font color="blue">Account</font></b>
 * @author Sahaban Arshad
 * @virsion 1.0 Jun 20, 2016
 *
 */
public abstract class Account extends Person {
	/**
	 * 
	 * @param number
	 */
	public abstract void getNumber(int number);

	/**
	 * 
	 * @param blance
	 */
	public abstract void getBal(double blance);

	/**
	 * 
	 */
	public abstract void getQwner();

	/**
	 * 
	 * @param deposit_cash
	 */
	public abstract void deposit(double deposit_cash);

	/**
	 * 
	 * @param withdrwa_cash
	 */
	public abstract void withdraw(double withdrwa_cash);

}
