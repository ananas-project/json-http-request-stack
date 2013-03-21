package ananas.lib.impl.jhrs;

import ananas.lib.jhrs.JHRSAddressComponent;
import ananas.lib.jhrs.JHRSAddressSystem;
import ananas.lib.jhrs.ServerAddress;
import ananas.lib.jhrs.ServiceAddress;

public class JHRSServerImpl implements ServerAddress {

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
	public ServiceAddress getService(int port) {
		String scheme = null;
		return this.getService(scheme, port);
	}

	@Override
	public ServiceAddress getService(String scheme) {
		int port = -1;
		return this.getService(scheme, port);
	}

	@Override
	public ServiceAddress getService(String scheme, int port) {
		return new JHRSServiceImpl(this.mAddrSys, this, scheme, port);
	}

	@Override
	public JHRSAddressComponent getParent() {
		return null;
	}

}
