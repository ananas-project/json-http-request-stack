package ananas.lib.jhrslite;

public interface JhrsLiteClient {

	JhrsLiteEndpoint openEndpoint(String url);

	void setListener(JhrsLiteRequestListener listener);

}
