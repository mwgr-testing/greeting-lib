package net.mwgr.testing.github.greeting.lib;

import static java.lang.String.format;
import static java.util.Objects.requireNonNull;

public class Greeter {

	private static final String HELLO_FORMAT = "Hello %s!";
	private static final String WORLD = "World";

	public String greet() {
		return greet(WORLD);
	}

	public String greet(String name) {
		return format(HELLO_FORMAT, requireNonNull(name));
	}

}
