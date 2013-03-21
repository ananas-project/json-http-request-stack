package ananas.lib.impl.jhrs.client;

import ananas.lib.jhrs.JHRSAddressSystem;
import ananas.lib.jhrs.ClassAddress;
import ananas.lib.jhrs.NodeAddress;
import ananas.lib.jhrs.ObjectAddress;
import ananas.lib.jhrs.client.ClassEndpoint;
import ananas.lib.jhrs.client.NodeEndpoint;
import ananas.lib.jhrs.client.ObjectEndpoint;
import ananas.lib.jhrs.client.UserAgent;

public class UserAgentImpl implements UserAgent {

	private JHRSAddressSystem mAddrSys;

	public UserAgentImpl() {
		this.mAddrSys = JHRSAddressSystem.Factory.getInstance();
	}

	@Override
	public JHRSAddressSystem getAddressSystem() {
		return this.mAddrSys;
	}

	@Override
	public ObjectEndpoint getObjectEndpoint(ObjectAddress obj) {
		return new ObjectEndpointImpl(this, obj);
	}

	@Override
	public ClassEndpoint getClassEndpoint(ClassAddress cls) {
		return new ClassEndpointImpl(this, cls);
	}

	@Override
	public NodeEndpoint getNodeEndpoint(NodeAddress node) {
		return new NodeEndpointImpl(this, node);
	}

}
