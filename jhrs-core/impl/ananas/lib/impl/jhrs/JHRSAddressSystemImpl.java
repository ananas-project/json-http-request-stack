package ananas.lib.impl.jhrs;

import java.net.URI;

import ananas.lib.jhrs.JHRSAddressSystem;
import ananas.lib.jhrs.ClassAddress;
import ananas.lib.jhrs.NodeAddress;
import ananas.lib.jhrs.ObjectAddress;
import ananas.lib.jhrs.ServerAddress;
import ananas.lib.jhrs.ServiceAddress;

public class JHRSAddressSystemImpl implements JHRSAddressSystem {

	@Override
	public ServerAddress getServer(String address) {
		return this._serverByURI(URI.create(address));
	}

	@Override
	public ServiceAddress getService(String address) {
		return this._serviceByURI(URI.create(address));
	}

	@Override
	public NodeAddress getNode(String address) {
		return this._nodeByURI(URI.create(address));
	}

	@Override
	public ObjectAddress getObject(String address) {
		return this._objectByURI(URI.create(address));
	}

	@Override
	public ClassAddress getClassAddress(String address) {
		return this._classByURI(URI.create(address));
	}

	private NodeAddress _nodeByURI(URI uri) {
		String path = uri.getPath();
		int i0 = path.indexOf('/');
		int i1 = path.lastIndexOf('/');
		String name;
		if (0 <= i0 && i0 <= i1) {
			name = path.substring(i0, i1 + 1);
		} else {
			name = "/";
		}
		ServiceAddress service = this._serviceByURI(uri);
		return service.getNodeByName(name);
	}

	private ClassAddress _classByURI(URI uri) {
		String path = uri.getPath();
		int i0 = path.lastIndexOf('/');
		String name;
		if (i0 < 0) {
			name = "";
		} else {
			name = path.substring(i0 + 1);
		}
		NodeAddress node = this._nodeByURI(uri);
		return node.getClassByName(name);
	}

	private ObjectAddress _objectByURI(URI uri) {
		String name = uri.getQuery();
		ClassAddress cls = this._classByURI(uri);
		return cls.getObjectByName("?" + name);
	}

	private ServiceAddress _serviceByURI(URI uri) {
		String scheme = uri.getScheme();
		int port = uri.getPort();
		ServerAddress server = this._serverByURI(uri);
		return server.getService(scheme, port);
	}

	private ServerAddress _serverByURI(URI uri) {
		return new JHRSServerImpl(this, uri.getHost());
	}

}
