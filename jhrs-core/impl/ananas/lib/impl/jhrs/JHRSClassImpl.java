package ananas.lib.impl.jhrs;

import ananas.lib.jhrs.JHRSAddressComponent;
import ananas.lib.jhrs.JHRSAddressSystem;
import ananas.lib.jhrs.JHRSClass;
import ananas.lib.jhrs.JHRSNode;
import ananas.lib.jhrs.JHRSObject;

public class JHRSClassImpl implements JHRSClass {

	private final JHRSNode mOwner;
	private final JHRSAddressSystem mAddrSys;
	private final String mName;

	public JHRSClassImpl(JHRSAddressSystem addrSys, JHRSNode owner, String name) {
		this.mAddrSys = addrSys;
		this.mOwner = owner;
		this.mName = name;
	}

	@Override
	public JHRSClass getOwnerClass() {
		return this;
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
	public JHRSNode getOwnerNode() {
		return this.mOwner;
	}

	@Override
	public JHRSObject getObjectByName(String name) {
		if (name.startsWith("?")) {
			return new JHRSObjectImpl(this.mAddrSys, this, name);
		} else {
			return null;
		}
	}

	@Override
	public JHRSAddressComponent getParent() {
		return this.mOwner;
	}

}
