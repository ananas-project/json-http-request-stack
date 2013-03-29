package ananas.lib.jhrslite;

import java.util.Map;

import ananas.lib.json.JSONObject;

public interface JhrsLiteRequest {

	void setListener(JhrsLiteRequestListener listener);

	void send();

	JhrsLiteEndpoint getEndpoint();

	Map<String, String> getParameters();

	void processResponse(JSONObject obj);

}
