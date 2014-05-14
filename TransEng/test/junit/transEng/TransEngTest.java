package junit.transEng;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import junit.transEng.TransEng;
import org.junit.Test;

public class TransEngTest {
	
	@Test
		public void three���擾�ł���() {		
			TransEng trans = new TransEng();
			String expected = "three";
			String actual = trans.translateEng(3);
			assertThat(actual,is(expected));
		}
	@Test
	public void thiteen���擾�ł���() {		
		TransEng trans = new TransEng();
		String expected = "thirteen";
		String actual = trans.translateEng(13);
		assertThat(actual,is(expected));
	}


}
