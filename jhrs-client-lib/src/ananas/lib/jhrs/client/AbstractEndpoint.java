package ananas.lib.jhrs.client;

import java.util.Map;

import ananas.lib.jhrs.JHRSAddressComponent;
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
	public JSONObject invoke(Map<String, String> param) {
		return this.mEp.invoke(param);
	}

	@Override
	public JHRSAddressComponent getAddress() {
		return this.mEp.getAddress();
	}

}
