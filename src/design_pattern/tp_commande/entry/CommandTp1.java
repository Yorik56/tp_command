package design_pattern.tp_commande.entry;

import design_pattern.tp_commande.entities.Client;
import design_pattern.tp_commande.entities.GlobalStock;
import design_pattern.tp_commande.entities.Stock;

/**
*
* @author tactfactory
*
* - Le programme doit utiliser un design pattern "Command" afin d'avoir les �l�ments suivant :
*   - 1 : Le programme permettra de g�rer des stocks d'�l�ment :
*       - 1 : On d�finira GlobalStock comme poss�dant une liste de Stock
*       - 2 : On ne pourra rajouter dans un GlobalStock que des �l�ments de Stock configurer par leur nom et une
*           quantit� initialement �gale � z�ro
*       - 3 : Un Stock, � part comme configuration d'un GlobalStock, sera toujours construit en prenant comme
*           informations un nom, une quantit� et le GlobalStock au quel il appartient
*       - 4 : Un Stock pourra �tre achet� ou vendu
*   - 2 : Votre design pattern "Command" doit permettre :
*       - 1 : De concerver toutes les commandes d'achat et de vente
*       - 2 : D'appliquer en une fois toutes les commandes sur le GlobalStock qui leur est rattach�
*       - 3 : Attention il est possible de continuer � passer d'autre commandes d'achat et de vente avec les m�me objets
*   - 3 : Le lancement de l'application doit afficher les �l�ments suivant :
*
*       Stock [ Name: myItem,Quantity: 0]
*       Stock [ Name: apple,Quantity: 0]
*       Stock [ Name: pinapple,Quantity: 0]
*
*
*       Stock [ Name: myItem,Quantity: 20 ] bought
*       Stock [ Name: myItem,Quantity: 20 ] sold
*       Stock [ Name: apple,Quantity: 4 ] sold
*       Stock [ Name: pinapple,Quantity: 7 ] bought
*
*
*       Stock [ Name: myItem,Quantity: 0]
*       Stock [ Name: apple,Quantity: -4]
*       Stock [ Name: pinapple,Quantity: 7]
*/
public class CommandTp1 {
  public static void main(String[] args) {
	  Client client = new Client();
	  GlobalStock stock1 = new GlobalStock();
	  stock1.setName("bannanes");
  }
}
