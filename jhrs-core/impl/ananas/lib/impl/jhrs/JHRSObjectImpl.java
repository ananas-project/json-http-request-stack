package ananas.lib.impl.jhrs;

import ananas.lib.jhrs.JHRSAddressComponent;
import ananas.lib.jhrs.JHRSAddressSystem;
import ananas.lib.jhrs.ClassAddress;
import ananas.lib.jhrs.ObjectAddress;

public class JHRSObjectImpl implements ObjectAddress {

	private final ClassAddress mOwner;
	private final JHRSAddressSystem mAddrSys;
	private final String mName;

	public JHRSObjectImpl(JHRSAddressSystem addrSys, ClassAddress owner,
			String name) {
		this.mOwner = owner;
		this.mAddrSys = addrSys;
		this.mName = name;
	}

	@Override
	public JHRSAddressSystem getAddressSystem() {
		return this.mAddrSys;
	}

	@Override
	public String getAddressString() {
		return this.mOwner.getAddressString() + this.mName;
	}

	@Override
	public ClassAddress getOwnerClass() {
		return this.mOwner;
	}

	@Override
	public JHRSAddressComponent getParent() {
		return this.mOwner;
	}

}
