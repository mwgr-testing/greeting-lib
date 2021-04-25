package net.mwgr.testing.github.greeting.lib;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class GreeterTest {

	private final Greeter greeter = new Greeter();

	@Test
	public void testGreeterWithoutArgument() {
		assertThat(greeter.greet(), is("Hello World!"));
	}

	@Test
	public void testGreeterWithArgument() {
		assertThat(greeter.greet("MWGR"), is("Hello MWGR!"));
	}

	@Test
	public void nullArgumentShouldBeRejected() {
		assertThrows(NullPointerException.class, () -> greeter.greet(null));
	}

}
