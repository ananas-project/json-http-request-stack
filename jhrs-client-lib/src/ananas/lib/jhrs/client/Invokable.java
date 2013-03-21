package ananas.lib.jhrs.client;

import java.util.Map;

import ananas.lib.json.JSONObject;

public interface Invokable {

	JSONObject invoke(Map<String, String> param);

}
