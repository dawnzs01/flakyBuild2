package zingg.hash;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import zingg.common.core.hash.IdentityString;

public class TestIdentityString {
	
	@Test
	public void testIdentityString() {
	    IdentityString value = getInstance();
		assertEquals("unhappy", value.call(" UnHappy "));
	}

    private IdentityString getInstance() {
        return new IdentityString();
    }


}
