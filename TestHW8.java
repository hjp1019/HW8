package hw8;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import hw8.JunitTesting;

class TestHW8 {

	@Test
	void testSubscriberEvens1() {
		JunitTesting test = new JunitTesting();
		boolean output = test.testEvensNotifySubscriber();
		assertEquals(false, output);
	}

	@Test
	void testSubscriberEvens2() {
		JunitTesting test = new JunitTesting();
		int output = test.testEvensNotifySubscriber2();
		assertEquals(1, output);
	}

	@Test
	void testSubscriberEvens3() {
		JunitTesting test = new JunitTesting();
		boolean output = test.testEvensNotifySubscriber3();
		assertEquals(true, output);
	}

	@Test
	void testPublisherImpl() {
		JunitTesting test = new JunitTesting();
		boolean output = test.testPublisherImplAddSubscriber();
		assertEquals(true, output);
	}

	@Test
	void testPublisherImpl2() {
		JunitTesting test = new JunitTesting();
		boolean output = test.testPublisherImplRemoveSubscriber();
		assertEquals(false, output);
	}

	@Test
	void testPublisherImpl3() {
		JunitTesting test = new JunitTesting();
		boolean output = test.testPublisherImplNothifySubscriber();
		assertEquals(false, output);
	}

}
