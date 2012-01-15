package org.springframework.social.intuit.connect;

import org.springframework.social.intuit.api.Intuit;
import org.springframework.social.intuit.api.impl.IntuitTemplate;
import org.springframework.social.oauth1.AbstractOAuth1ServiceProvider;
import org.springframework.social.oauth1.OAuth1Template;

/**
 * Intuit ServiceProvider implementation.
 * @author Jeffrey Williams
 */
public class IntuitServiceProvider extends AbstractOAuth1ServiceProvider<Intuit> {

	public IntuitServiceProvider(String consumerKey, String consumerSecret) {
		super(consumerKey, consumerSecret, new OAuth1Template(consumerKey, consumerSecret,
			"https://oauth.intuit.com/oauth/v1/get_request_token",
			"https://appcenter.intuit.com/Connect/Begin",
			"https://oauth.intuit.com/oauth/v1/get_access_token"));
	}

	
	@Override
	public Intuit getApi(String accessToken, String secret) {
		return new IntuitTemplate(getConsumerKey(), getConsumerSecret(), accessToken, secret);
	}

}