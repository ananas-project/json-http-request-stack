package ananas.lib.impl.jhrs;

import ananas.lib.jhrs.JHRSAddressComponent;
import ananas.lib.jhrs.JHRSAddressSystem;
import ananas.lib.jhrs.JHRSClass;
import ananas.lib.jhrs.JHRSObject;

public class JHRSObjectImpl implements JHRSObject {

	private final JHRSClass mOwner;
	private final JHRSAddressSystem mAddrSys;
	private final String mName;

	public JHRSObjectImpl(JHRSAddressSystem addrSys, JHRSClass owner,
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
	public JHRSClass getOwnerClass() {
		return this.mOwner;
	}

	@Override
	public JHRSAddressComponent getParent() {
		return this.mOwner;
	}

}
