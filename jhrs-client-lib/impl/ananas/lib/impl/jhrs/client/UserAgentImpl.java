package ananas.lib.impl.jhrs.client;

import ananas.lib.jhrs.JHRSAddressSystem;
import ananas.lib.jhrs.JHRSClass;
import ananas.lib.jhrs.JHRSNode;
import ananas.lib.jhrs.JHRSObject;
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
	public ObjectEndpoint getObjectEndpoint(JHRSObject obj) {
		return new ObjectEndpointImpl(this, obj);
	}

	@Override
	public ClassEndpoint getClassEndpoint(JHRSClass cls) {
		return new ClassEndpointImpl(this, cls);
	}

	@Override
	public NodeEndpoint getNodeEndpoint(JHRSNode node) {
		return new NodeEndpointImpl(this, node);
	}

}
