package ananas.lib.impl.jhrs.client;

import java.util.Map;

import ananas.lib.jhrs.JHRSObject;
import ananas.lib.jhrs.client.ObjectEndpoint;
import ananas.lib.jhrs.client.UserAgent;
import ananas.lib.json.JSONObject;

public class ObjectEndpointImpl implements ObjectEndpoint {

	private final JHRSObject mObjectAddr;
	private final UserAgent mUserAgent;

	public ObjectEndpointImpl(UserAgent ua, JHRSObject obj) {
		this.mObjectAddr = obj;
		this.mUserAgent = ua;
	}

	@Override
	public UserAgent getUserAgent() {
		return this.mUserAgent;
	}

	@Override
	public String getURL() {
		return this.mObjectAddr.getAddressString();
	}

	@Override
	public JHRSObject getJHRSObject() {
		return this.mObjectAddr;
	}

	@Override
	public JSONObject invoke(Map<String, String> param) {
		// TODO Auto-generated method stub
		return null;
	}

}
