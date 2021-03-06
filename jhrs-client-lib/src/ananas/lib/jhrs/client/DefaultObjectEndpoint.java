package ananas.lib.jhrs.client;

import ananas.lib.jhrs.ObjectAddress;

public class DefaultObjectEndpoint extends AbstractEndpoint implements ObjectEndpoint {

	public DefaultObjectEndpoint(String url) {
		super(urlToCore(url));
	}

	private static ObjectEndpoint urlToCore(String url) {
		UserAgent agent = UserAgent.Factory.getAgent();
		ObjectAddress addr = agent.getAddressSystem().getObject(url);
		ObjectEndpoint ep = agent.getObjectEndpoint(addr);
		return ep;
	}

	@Override
	public ObjectAddress getJHRSObject() {
		return (ObjectAddress) this.getAddress();
	}
}
