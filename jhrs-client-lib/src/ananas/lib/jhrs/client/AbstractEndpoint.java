package ananas.lib.jhrs.client;

import java.util.Map;

import ananas.lib.jhrs.JHRSObject;
import ananas.lib.json.JSONObject;

public class AbstractEndpoint implements ObjectEndpoint {

	private final ObjectEndpoint mTarget;

	public AbstractEndpoint(ObjectEndpoint target) {
		this.mTarget = target;
	}

	public AbstractEndpoint(String url) {
		UserAgent agent = UserAgent.Factory.getAgent();
		JHRSObject objAddr = agent.getAddressSystem().getObject(url);
		this.mTarget = agent.getObjectEndpoint(objAddr);
	}

	@Override
	public JSONObject invoke(Map<String, String> param) {
		return this.mTarget.invoke(param);
	}

	@Override
	public UserAgent getUserAgent() {
		return this.mTarget.getUserAgent();
	}

	@Override
	public String getURL() {
		return this.mTarget.getURL();
	}

	@Override
	public JHRSObject getJHRSObject() {
		return this.mTarget.getJHRSObject();
	}

}
