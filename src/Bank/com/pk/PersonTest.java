package Bank.com.pk;

import static org.junit.Assert.*;

import org.junit.Test;

/**
*@author Sahaban Arshad
*@virsion 1.0 Jun 20, 2016
*
*/
public class PersonTest {

	@Test
	public void test() {
		Person obj=new Person();
		String result=obj.getName("shaban");
		assertEquals(result,"shaban");
	}

}
