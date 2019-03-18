package fr.activconsulting.paris;

import java.net.ServerSocket;

public final class Server {
	
	/*
	 * Il faut cr�er une porte (ServerSocket) qui va g�rer les connexion.
	 */
	private ServerSocket connectionSocket = null;
	
	/*
	 * Il faut cr�er une porte (Socket) qui va pouvoir g�rer les �changes.
	 */
	
	/*
	 * Il faut stocker les messages recus dans un objet en m�moire tampon (BufferReader)
	 */

	
	/*
	 * Il faut envoyre les messages au client (PrintWriter)
	 */
	
	/*
	 * D�finir le port su lequel le serveur doit �couter. (int)
	 */
	
	
	
	
	/**
	 * Objet repr�santant un serveur de communication de messagerie instant.
	 */
	public Server() {
		
	}
	
	/**
	 * Fonction qui permet de d�marer le serveur de la messagerie instant.
	 */
	public void begin() {
		
		// On va avoir du code qui peut faire p�ter le programme...
		
			// On va initialiser le serveur, et on va lui donner le port sur lequel
			// il va devoir �couter (Socket de Serveur).
			
			// Faire en sorte que le socket de connexion accepte les connexion (accept())
		
			// On pr�pare les informations � envoyer au client
			// [...] = new PrintWriter(this.connectionSocket.getOutputStream());
		
			// On pr�pare les buffer de lecture qui va lire un flux de lecture entrant
			// � partir de ce que le cleint aura envoy�, et donc, que le serveur aura recu.
			// [...] = new BufferedReader(new InputStreamReader(this.connectionSocket.getInputStream()));
			
			// On cr�er un thrad pour d�marrer notre serveur
		
			// On cr�� un thread por que notre serveur soit aussi un client.
			// Le serveur pourra lui aussi communiquer avec le client.
		
			// Il faut d�marrer les deux thread pr�c�dement cr��.
			
		
		// Si on a pas r�sussis �� d�marrer le serveur..
			// ...
		
		
	}
	
	
}











