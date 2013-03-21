package ananas.lib.jhrs.client;

import ananas.lib.jhrs.JHRSClass;

public class DefaultClassEndpoint extends AbstractEndpoint implements
		ClassEndpoint {

	public DefaultClassEndpoint(String url) {
		super(targetFromURL(url));
	}

	private static ClassEndpoint targetFromURL(String url) {
		UserAgent agent = UserAgent.Factory.getAgent();
		JHRSClass clsAddr = agent.getAddressSystem().getClassAddress(url);
		ClassEndpoint ep = agent.getClassEndpoint(clsAddr);
		return ep;
	}

	@Override
	public JHRSClass getJHRSClass() {
		return this.getJHRSObject().getOwnerClass();
	}
}
