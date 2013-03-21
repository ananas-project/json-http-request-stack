package ananas.lib.impl.jhrs;

import ananas.lib.jhrs.JHRSAddressComponent;
import ananas.lib.jhrs.JHRSAddressSystem;
import ananas.lib.jhrs.JHRSServer;
import ananas.lib.jhrs.JHRSService;

public class JHRSServerImpl implements JHRSServer {

	private final JHRSAddressSystem mAddrSys;
	private final String mHost;

	public JHRSServerImpl(JHRSAddressSystem addrSys, String hostName) {
		this.mAddrSys = addrSys;
		this.mHost = hostName;
	}

	@Override
	public JHRSAddressSystem getAddressSystem() {
		return this.mAddrSys;
	}

	@Override
	public String getAddressString() {
		return this.mHost;
	}

	@Override
	public JHRSService getService(int port) {
		String scheme = null;
		return this.getService(scheme, port);
	}

	@Override
	public JHRSService getService(String scheme) {
		int port = -1;
		return this.getService(scheme, port);
	}

	@Override
	public JHRSService getService(String scheme, int port) {
		return new JHRSServiceImpl(this.mAddrSys, this, scheme, port);
	}

	@Override
	public JHRSAddressComponent getParent() {
		return null;
	}

}
