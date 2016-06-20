package Bank.com.pk;

import static org.junit.Assert.*;

import org.junit.Test;

/**
*@author Sahaban Arshad
*@virsion 1.0 Jun 20, 2016
*
*/
public class BankSimulationTest {

	@Test
	public void testMain() {
		Bank obj=new Bank();
		int result=obj.selectAccount(5);
		assertEquals(result,5);
	}

}
