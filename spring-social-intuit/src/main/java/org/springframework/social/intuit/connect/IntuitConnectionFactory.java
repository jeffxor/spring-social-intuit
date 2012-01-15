package org.springframework.social.intuit.connect;

import org.springframework.social.connect.support.OAuth1ConnectionFactory;
import org.springframework.social.intuit.api.Intuit;

/**
 * Intuit ConnectionFactory implementation.
 * @author Jeffrey Williams
 */
public class IntuitConnectionFactory extends OAuth1ConnectionFactory<Intuit> {

	public IntuitConnectionFactory(String consumerKey, String consumerSecret) {
		super("intuit", new IntuitServiceProvider(consumerKey, consumerSecret), new IntuitAdapter());
	}
	
}
