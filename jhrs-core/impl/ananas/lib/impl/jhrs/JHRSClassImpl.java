package ananas.lib.impl.jhrs;

import ananas.lib.jhrs.JHRSAddress;
import ananas.lib.jhrs.JHRSAddressSystem;
import ananas.lib.jhrs.ClassAddress;
import ananas.lib.jhrs.NodeAddress;
import ananas.lib.jhrs.ObjectAddress;

public class JHRSClassImpl implements ClassAddress {

	private final NodeAddress mOwner;
	private final JHRSAddressSystem mAddrSys;
	private final String mName;

	public JHRSClassImpl(JHRSAddressSystem addrSys, NodeAddress owner, String name) {
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
	public NodeAddress getOwnerNode() {
		return this.mOwner;
	}

	@Override
	public ObjectAddress getObjectByName(String name) {
		if (name.startsWith("?")) {
			return new JHRSObjectImpl(this.mAddrSys, this, name);
		} else {
			return null;
		}
	}

	@Override
	public JHRSAddress getParent() {
		return this.mOwner;
	}

}
