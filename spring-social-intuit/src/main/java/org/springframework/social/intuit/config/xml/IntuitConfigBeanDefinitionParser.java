package org.springframework.social.intuit.config.xml;

import org.springframework.social.config.xml.AbstractProviderConfigBeanDefinitionParser;
import org.springframework.social.intuit.config.support.IntuitApiHelper;
import org.springframework.social.intuit.connect.IntuitConnectionFactory;
import org.springframework.social.intuit.security.IntuitAuthenticationService;
import org.springframework.social.security.provider.SocialAuthenticationService;

public class IntuitConfigBeanDefinitionParser extends AbstractProviderConfigBeanDefinitionParser {

    public IntuitConfigBeanDefinitionParser() {
        super(IntuitConnectionFactory.class, IntuitApiHelper.class);
	}
	
	@Override
	protected Class<? extends SocialAuthenticationService<?>> getAuthenticationServiceClass() {
	        return IntuitAuthenticationService.class;
	}

}
