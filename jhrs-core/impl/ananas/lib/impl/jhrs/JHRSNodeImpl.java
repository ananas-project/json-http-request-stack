package ananas.lib.impl.jhrs;

import ananas.lib.jhrs.JHRSAddressComponent;
import ananas.lib.jhrs.JHRSAddressSystem;
import ananas.lib.jhrs.JHRSClass;
import ananas.lib.jhrs.JHRSNode;
import ananas.lib.jhrs.JHRSService;

public class JHRSNodeImpl implements JHRSNode {

	private final JHRSAddressSystem mAddrSys;
	private final JHRSService mOwner;
	private final String mName;

	public JHRSNodeImpl(JHRSAddressSystem addrSys, JHRSService owner,
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
	public String getAddressString() {
		return this.mOwner.getAddressString() + this.mName;
	}

	@Override
	public JHRSService getOwnerService() {
		return this.mOwner;
	}

	@Override
	public JHRSClass getClassByName(String name) {
		return new JHRSClassImpl(this.mAddrSys, this, name);
	}

	@Override
	public JHRSAddressComponent getParent() {
		return this.mOwner;
	}

}
