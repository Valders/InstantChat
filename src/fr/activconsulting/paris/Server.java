package fr.activconsulting.paris;

import java.net.ServerSocket;

public final class Server {
	
	/*
	 * Il faut créer une porte (ServerSocket) qui va gérer les connexion.
	 */
	private ServerSocket connectionSocket = null;
	
	/*
	 * Il faut créer une porte (Socket) qui va pouvoir gérer les échanges.
	 */
	
	/*
	 * Il faut stocker les messages recus dans un objet en mémoire tampon (BufferReader)
	 */

	
	/*
	 * Il faut envoyre les messages au client (PrintWriter)
	 */
	
	/*
	 * Définir le port su lequel le serveur doit écouter. (int)
	 */
	
	
	
	
	/**
	 * Objet représantant un serveur de communication de messagerie instant.
	 */
	public Server() {
		
	}
	
	/**
	 * Fonction qui permet de démarer le serveur de la messagerie instant.
	 */
	public void begin() {
		
		// On va avoir du code qui peut faire péter le programme...
		
			// On va initialiser le serveur, et on va lui donner le port sur lequel
			// il va devoir écouter (Socket de Serveur).
			
			// Faire en sorte que le socket de connexion accepte les connexion (accept())
		
			// On prépare les informations à envoyer au client
			// [...] = new PrintWriter(this.connectionSocket.getOutputStream());
		
			// On prépare les buffer de lecture qui va lire un flux de lecture entrant
			// à partir de ce que le cleint aura envoyé, et donc, que le serveur aura recu.
			// [...] = new BufferedReader(new InputStreamReader(this.connectionSocket.getInputStream()));
			
			// On créer un thrad pour démarrer notre serveur
		
			// On créé un thread por que notre serveur soit aussi un client.
			// Le serveur pourra lui aussi communiquer avec le client.
		
			// Il faut démarrer les deux thread précédement créé.
			
		
		// Si on a pas résussis àà démarrer le serveur..
			// ...
		
		
	}
	
	
}











