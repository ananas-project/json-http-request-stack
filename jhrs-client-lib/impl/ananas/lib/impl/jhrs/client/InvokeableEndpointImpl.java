package ananas.lib.impl.jhrs.client;

import ananas.lib.io.Connector;
import ananas.lib.jhrs.JHRSAddress;
import ananas.lib.jhrs.client.InvokeableEndpoint;
import ananas.lib.jhrs.client.ParameterList;
import ananas.lib.jhrs.client.UserAgent;
import ananas.lib.json.JSON;
import ananas.lib.json.JSONObject;

public class InvokeableEndpointImpl implements InvokeableEndpoint {

	private final UserAgent mUserAgent;
	private final JHRSAddress mAddr;
	private String mCurURL;

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
		String url = this.mCurURL;
		if (url == null) {
			url = this.getURL();
			this.mCurURL = url;
		}
		JSONObject obj = JSON.Factory.getImplementation().createObject();
		RequestContext context = new RequestContext();
		context.mConnector = this.mUserAgent.getConnector();
		context.mJSONObject = obj;
		context.mParameter = param;
		for (int timeout = 10; timeout > 0; timeout--) {
			if (context.doSimpleRequest()) {
				break;
			}
		}
		obj.clear();
		obj.putInt("code", 10000);
		obj.put("message", "unknow");
		return obj;
	}

	class RequestContext {

		public ParameterList mParameter;
		public Connector mConnector;
		public JSONObject mJSONObject;

		public boolean doSimpleRequest() {
			// TODO Auto-generated method stub
			return false;
		}
	}

}
