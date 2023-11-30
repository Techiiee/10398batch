package mockitoExample;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)

public class MainApplicationTest {

	 //@InjectMocks annotation is used to create and inject the mock object
	   @InjectMocks 
	   MainApplication mathApplication = new MainApplication();

	   //@Mock annotation is used to create the mock object to be injected
	   @Mock
	   Calculator calculator;

	   @Test
	   public void testAdd(){
	      //add the behavior of calc service to add two numbers
	    when(calculator.add(10.00,20.0)).thenReturn(30.00);
			
	      //test the add functionality
	      Assert.assertEquals(mathApplication.add(10.0, 20.0),30.0,0);
	    }
}
