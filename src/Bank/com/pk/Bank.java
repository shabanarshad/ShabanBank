package Bank.com.pk;

/**
 * Bank Class use for making account
 * 
 * <b><font color="blue">Bank</font></b>
 * @author Sahaban Arshad
 * @virsion 1.0 Jun 20, 2016
 *
 */
public class Bank extends Account {
	Account account;

	/**
	 * this method use for add new account
	 * <i><font color="green">addAccount</font> </i>
	 * @param account
	 */
	public void addAccount(Account account) {
		int number = 0;
		account.getNumber(number);
	}

	/**
	 * this method provoide facilaty to chose the Account type
	 */
	public int selectAccount(int select) {
     select=5;
		return select;
	}

	/**
	 * @param number
	 * it is override method take number of the user
	 */
	@Override
	public void getNumber(int number) {
		// TODO Auto-generated method stub

	}

	/**
	 * @param blance
	 *            take balance of the user
	 */
	@Override
	public void getBal(double blance) {
		// TODO Auto-generated method stub

	}

	@Override
	/**
	 * used for user authentication
	 */
	public void getQwner() {
		// TODO Auto-generated method stub

	}

	/**
	 * @param deposit_cash
	 *            used for getting cash information
	 */
	@Override
	public void deposit(double deposit_cash) {
		// TODO Auto-generated method stub

	}

	/**
	 * @param withdraw_cash
	 *
	 */
	@Override
	public void withdraw(double withdrwa_cash) {
		// TODO Auto-generated method stub

	}
}