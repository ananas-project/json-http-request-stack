package ananas.lib.impl.jhrs.client;

import ananas.lib.jhrs.JHRSAddress;
import ananas.lib.jhrs.client.InvokeableEndpoint;
import ananas.lib.jhrs.client.ParameterList;
import ananas.lib.jhrs.client.UserAgent;
import ananas.lib.json.JSONObject;

public class InvokeableEndpointImpl implements InvokeableEndpoint {

	private final UserAgent mUserAgent;
	private final JHRSAddress mAddr;

	public InvokeableEndpointImpl(UserAgent ua, JHRSAddress addr) {
		this.mUserAgent = ua;
		this.mAddr = addr;
	}

	@Override
	public UserAgent getUserAgent() {
		return this.mUserAgent;
	}

	@Override
	public String getURL() {
		return this.mAddr.getURL();
	}

	@Override
	public JHRSAddress getAddress() {
		return this.mAddr;
	}

	@Override
	public JSONObject invoke(ParameterList param) {
		// TODO Auto-generated method stub
		return null;
	}

}
