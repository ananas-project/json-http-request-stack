package ananas.lib.impl.jhrs.client;

import ananas.lib.jhrs.JHRSClass;
import ananas.lib.jhrs.client.ClassEndpoint;
import ananas.lib.jhrs.client.UserAgent;

public class ClassEndpointImpl extends ObjectEndpointImpl implements
		ClassEndpoint {

	public ClassEndpointImpl(UserAgent agent, JHRSClass cls) {
		super(agent, cls.getObjectByName(""));
	}

	@Override
	public JHRSClass getJHRSClass() {
		return this.getJHRSObject().getOwnerClass();
	}

}
