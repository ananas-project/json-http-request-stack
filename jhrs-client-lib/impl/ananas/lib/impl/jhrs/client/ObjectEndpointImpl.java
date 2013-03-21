package ananas.lib.impl.jhrs.client;

import ananas.lib.jhrs.ObjectAddress;
import ananas.lib.jhrs.client.ObjectEndpoint;
import ananas.lib.jhrs.client.UserAgent;

public class ObjectEndpointImpl extends InvokeableEndpointImpl implements
		ObjectEndpoint {

	private final ObjectAddress mObjectAddr;

	public ObjectEndpointImpl(UserAgent ua, ObjectAddress addr) {
		super(ua, addr);
		this.mObjectAddr = addr;
	}

	@Override
	public ObjectAddress getJHRSObject() {
		return this.mObjectAddr;
	}

}
