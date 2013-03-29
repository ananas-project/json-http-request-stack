package ananas.lib.jhrslite;

public interface JhrsLiteRequestListener {

	void onError(JhrsLiteRequest request, Throwable err);

	void onSuccess(JhrsLiteRequest request);

}
