package junit;

import java.util.ArrayList;
import java.util.List;

public class Bank {
	
	private List<Client> clients;
	
	public Bank() {
		clients = new ArrayList<>();
	}
	
	public void addClient(Client client) {
		this.clients.add(client);
	}
	
	public List<Client> getClients() {
		return this.clients;
	}

}
