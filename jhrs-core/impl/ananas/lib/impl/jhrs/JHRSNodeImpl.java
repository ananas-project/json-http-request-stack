package ananas.lib.impl.jhrs;

import ananas.lib.jhrs.JHRSAddress;
import ananas.lib.jhrs.JHRSAddressSystem;
import ananas.lib.jhrs.ClassAddress;
import ananas.lib.jhrs.NodeAddress;
import ananas.lib.jhrs.ServiceAddress;

public class JHRSNodeImpl implements NodeAddress {

	private final JHRSAddressSystem mAddrSys;
	private final ServiceAddress mOwner;
	private final String mName;

	public JHRSNodeImpl(JHRSAddressSystem addrSys, ServiceAddress owner,
			String name) {
		this.mAddrSys = addrSys;
		this.mOwner = owner;
		this.mName = name;
	}

	@Override
	public JHRSAddressSystem getAddressSystem() {
		return this.mAddrSys;
	}

	@Override
	public String getURL() {
		return this.mOwner.getURL() + this.mName;
	}

	@Override
	public ServiceAddress getOwnerService() {
		return this.mOwner;
	}

	@Override
	public ClassAddress getClassByName(String name) {
		return new JHRSClassImpl(this.mAddrSys, this, name);
	}

	@Override
	public JHRSAddress getParent() {
		return this.mOwner;
	}

}
