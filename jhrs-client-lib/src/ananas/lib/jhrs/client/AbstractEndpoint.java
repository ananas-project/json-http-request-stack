package ananas.lib.jhrs.client;

import ananas.lib.jhrs.JHRSAddress;
import ananas.lib.json.JSONObject;

public class AbstractEndpoint implements InvokeableEndpoint {

	private final InvokeableEndpoint mEp;

	public AbstractEndpoint(InvokeableEndpoint ep) {
		this.mEp = ep;
	}

	@Override
	public UserAgent getUserAgent() {
		return this.mEp.getUserAgent();
	}

	@Override
	public String getURL() {
		return this.mEp.getURL();
	}

	@Override
	public JHRSAddress getAddress() {
		return this.mEp.getAddress();
	}

	@Override
	public JSONObject invoke(ParameterList param) {
		return this.mEp.invoke(param);
	}

}
