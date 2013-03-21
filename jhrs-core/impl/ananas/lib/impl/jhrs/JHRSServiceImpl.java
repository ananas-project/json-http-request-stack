package ananas.lib.impl.jhrs;

import ananas.lib.jhrs.JHRSAddressComponent;
import ananas.lib.jhrs.JHRSAddressSystem;
import ananas.lib.jhrs.JHRSNode;
import ananas.lib.jhrs.JHRSServer;
import ananas.lib.jhrs.JHRSService;

public class JHRSServiceImpl implements JHRSService {

	private final JHRSServer mOwner;
	private final JHRSAddressSystem mAddrSys;
	// private final URI mURI;
	private String mScheme;
	private int mPort;

	public JHRSServiceImpl(JHRSAddressSystem addrSys, JHRSServer owner,
			String scheme, int port) {
		this.mAddrSys = addrSys;
		this.mOwner = owner;
		this.mScheme = scheme + "";
		this.mPort = port;
	}

	@Override
	public JHRSAddressSystem getAddressSystem() {
		return this.mAddrSys;
	}

	@Override
	public String getAddressString() {
		String scheme = this.mScheme;
		String host = this.mOwner.getAddressString();
		int port = this.mPort;
		String strPort;
		if (port < 0) {
			strPort = "";
		} else {
			strPort = ":" + port;
		}
		return (scheme + "://" + host + strPort);
	}

	@Override
	public JHRSServer getOwnerServer() {
		return this.mOwner;
	}

	@Override
	public JHRSNode getNodeByName(String name) {
		int i1 = name.indexOf('/');
		int i2 = name.lastIndexOf('/');
		if (i1 >= 0 && i2 >= i1) {
			String name2 = name.substring(i1, i2 + 1);
			return new JHRSNodeImpl(this.mAddrSys, this, name2);
		} else {
			return null;
		}
	}

	@Override
	public JHRSAddressComponent getParent() {
		return this.mOwner;
	}

}
