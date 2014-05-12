package junit.transEng;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import junit.transEng.TransEng;
import org.junit.Test;

public class TransEngTest {
	
	@Test
		public void three‚ªŽæ“¾‚Å‚«‚é() {		
			TransEng trans = new TransEng();
			String expected = "four";
			String actual = trans.translateEng(3);
			assertThat(actual,is(expected));
		}


}
