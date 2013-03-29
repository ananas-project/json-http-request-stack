package ananas.lib.jhrslite;

import java.net.URI;
import java.util.Map;

public interface JhrsLiteEndpoint {

	JhrsLiteEndpoint openEndpoint(String url);

	void setListener(JhrsLiteRequestListener listener);

	JhrsLiteClient getClient();

	URI getURI();

	JhrsLiteRequest request(Map<String, String> param);

	JhrsLiteRequest requestLoad();

}
