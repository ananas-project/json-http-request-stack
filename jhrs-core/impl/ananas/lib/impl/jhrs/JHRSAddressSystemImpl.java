package ananas.lib.impl.jhrs;

import java.net.URI;

import ananas.lib.jhrs.JHRSAddressSystem;
import ananas.lib.jhrs.JHRSClass;
import ananas.lib.jhrs.JHRSNode;
import ananas.lib.jhrs.JHRSObject;
import ananas.lib.jhrs.JHRSServer;
import ananas.lib.jhrs.JHRSService;

public class JHRSAddressSystemImpl implements JHRSAddressSystem {

	@Override
	public JHRSServer getServer(String address) {
		return this._serverByURI(URI.create(address));
	}

	@Override
	public JHRSService getService(String address) {
		return this._serviceByURI(URI.create(address));
	}

	@Override
	public JHRSNode getNode(String address) {
		return this._nodeByURI(URI.create(address));
	}

	@Override
	public JHRSObject getObject(String address) {
		return this._objectByURI(URI.create(address));
	}

	@Override
	public JHRSClass getClassAddress(String address) {
		return this._classByURI(URI.create(address));
	}

	private JHRSNode _nodeByURI(URI uri) {
		String path = uri.getPath();
		int i0 = path.indexOf('/');
		int i1 = path.lastIndexOf('/');
		String name;
		if (0 <= i0 && i0 <= i1) {
			name = path.substring(i0, i1 + 1);
		} else {
			name = "/";
		}
		JHRSService service = this._serviceByURI(uri);
		return service.getNodeByName(name);
	}

	private JHRSClass _classByURI(URI uri) {
		String path = uri.getPath();
		int i0 = path.lastIndexOf('/');
		String name;
		if (i0 < 0) {
			name = "";
		} else {
			name = path.substring(i0 + 1);
		}
		JHRSNode node = this._nodeByURI(uri);
		return node.getClassByName(name);
	}

	private JHRSObject _objectByURI(URI uri) {
		String name = uri.getQuery();
		JHRSClass cls = this._classByURI(uri);
		return cls.getObjectByName("?" + name);
	}

	private JHRSService _serviceByURI(URI uri) {
		String scheme = uri.getScheme();
		int port = uri.getPort();
		JHRSServer server = this._serverByURI(uri);
		return server.getService(scheme, port);
	}

	private JHRSServer _serverByURI(URI uri) {
		return new JHRSServerImpl(this, uri.getHost());
	}

}
