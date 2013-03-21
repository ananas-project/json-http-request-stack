package ananas.lib.impl.jhrs.client;

import ananas.lib.jhrs.ClassAddress;
import ananas.lib.jhrs.client.ClassEndpoint;
import ananas.lib.jhrs.client.UserAgent;

public class ClassEndpointImpl extends ObjectEndpointImpl implements
		ClassEndpoint {

	public ClassEndpointImpl(UserAgent agent, ClassAddress cls) {
		super(agent, cls.getObjectByName(""));
	}

	@Override
	public ClassAddress getJHRSClass() {
		return this.getJHRSObject().getOwnerClass();
	}

}
