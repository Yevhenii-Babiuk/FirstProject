package project.first.epam.babiuk.PersonalTask;

import java.util.HashMap;

public class ClientBase {
    private static HashMap<String, Client> clientSurameBase = new HashMap<>();
    private static HashMap<Integer, Client> clientIdBase = new HashMap<>();

    public void addClient(Client client) {
        clientSurameBase.put(client.getSurname(), client);
        clientIdBase.put(client.getId(), client);
    }

    public void removeClient(Client client) {
        clientSurameBase.remove(client.getSurname(), client);
        clientIdBase.remove(client.getId(), client);
    }

    public Client getClient(String surname) {
        return clientSurameBase.get(surname);
    }

    public Client getClient(int id) {
        return clientIdBase.get(id);
    }
}
