package ananas.lib.jhrs.client;

import ananas.lib.jhrs.ClassAddress;

public class DefaultClassEndpoint extends AbstractEndpoint implements
		ClassEndpoint {

	public DefaultClassEndpoint(String url) {
		super(addrFromURL(url));
	}

	private static ClassEndpoint addrFromURL(String url) {
		UserAgent agent = UserAgent.Factory.getAgent();
		ClassAddress clsAddr = agent.getAddressSystem().getClassAddress(url);
		ClassEndpoint ep = agent.getClassEndpoint(clsAddr);
		return ep;
	}

	@Override
	public ClassAddress getJHRSClass() {
		return (ClassAddress) this.getAddress();
	}
}
