package ananas.lib.impl.jhrs.client;

import ananas.lib.jhrs.ClassAddress;
import ananas.lib.jhrs.client.ClassEndpoint;
import ananas.lib.jhrs.client.UserAgent;

public class ClassEndpointImpl extends InvokeableEndpointImpl implements
		ClassEndpoint {

	private final ClassAddress mClassAddr;

	public ClassEndpointImpl(UserAgent agent, ClassAddress addr) {
		super(agent, addr);
		this.mClassAddr = addr;
	}

	@Override
	public ClassAddress getJHRSClass() {
		return this.mClassAddr;
	}

}
