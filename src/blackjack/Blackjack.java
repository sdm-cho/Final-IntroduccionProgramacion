package blackjack;

import javax.swing.*;

class Blackjack {

	public static void main(String[] args) {
		String apux,preg,edad;
		int apu=0, gana=0, totusu = 0, totmaq = 0, valor=0 ,hid = 0, c1 = 0;
		int[] car = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52};
		String sigue = null;
		
		JOptionPane.showMessageDialog(null, "BIENVENIDOS AL JUEGO DE BLACKJACK!","Blackjack",JOptionPane.DEFAULT_OPTION,
				new ImageIcon(Blackjack.class.getResource("/img/bj6.jpg" )));
		edad=(String)JOptionPane.showInputDialog(null, "Es usted mayor de edad? si/no","Blackjack", JOptionPane.DEFAULT_OPTION,
				new ImageIcon(Blackjack.class.getResource("/img/preg.jpg")), null, null);		
		switch (edad.toLowerCase()) {
		case "no":
			JOptionPane.showMessageDialog(null, "NO TIENE PERMITIDO JUGAR BLACKJACK SI ES MENOR DE EDAD!","Blackjack",JOptionPane.DEFAULT_OPTION,
					new ImageIcon(Blackjack.class.getResource("/img/juz.jpg" )));						
			break;
		case "si":
			do {
	        	 totusu=0;
	           	 totmaq=0;
	           	 valor=0;
	           	 hid=0; 
	           	 
	        	JOptionPane.showMessageDialog(null, "Reglas del juego: \n-Se reparten dos cartas a cada uno pero la segunda carta de la banca esta dada vuelta \n-El jugador arma su jugada y luego se revela la carta de la banca. \n-La banca debe superar los 16 puntos \n-El que tenga mayor puntaje que no sea superior a 21 sera el ganador!","Blackjack",JOptionPane.DEFAULT_OPTION,
						new ImageIcon(Blackjack.class.getResource("/img/bj2.jpg" )));   
	        	JOptionPane.showMessageDialog(null, "Valores de las cartas: \n-As: 1 u 11 dependiendo del total. \n-2 a 10: Valor de la carta. \n-Figuras: 10","Blackjack",JOptionPane.DEFAULT_OPTION,
						new ImageIcon(Blackjack.class.getResource("/img/valores.jpg" )));
	        	apux=(String)JOptionPane.showInputDialog(null,"Ingrese apuesta!" ,"Blackjack",JOptionPane.DEFAULT_OPTION,
	        			new ImageIcon(Blackjack.class.getResource("/img/apu.gif")),null,null);
	        	apu=Integer.parseInt(apux);	        	
	        	JOptionPane.showMessageDialog(null, "Se mezclan las cartas y se reparten","Blackjack",JOptionPane.DEFAULT_OPTION,
						new ImageIcon(Blackjack.class.getResource("/img/shuff.gif" )));	        	
			// Primera carta de la banca
			for (int i = 0; i < 1; i++) {
				car[i] = (int) (Math.random() * 52 + 1);			
				if (car[i]>=10&&car[i]<=13||car[i]>=23&&car[i]<=26||car[i]>=36&&car[i]<=39||car[i]>=49&&car[i]<=52) {				
					valor = 10;								
				}  else if (car[i]==1||car[i]==14||car[i]==27||car[i]==40) {
					valor = 11;								
				} else if (car[i]>=2&&car[i]<=9){
					valor = car [i];								
				} else if (car[i]>=15&&car[i]<=22) {	
					valor = car[i] - 13;				
				} else if (car[i]>=28&&car[i]<=35) {	
					valor = car[i] - 26;				
				} else if (car[i]>=41&&car[i]<=48) {	
					valor = car[i] - 39;				
				}
				totmaq=totmaq+valor;
				c1=totmaq;
				JOptionPane.showMessageDialog(null, "Primera carta de la banca "+"\nTotal de la banca: " + totmaq ,"Blackjack",JOptionPane.DEFAULT_OPTION,
						new ImageIcon(Blackjack.class.getResource("/img/c" +car[i]+ ".jpg" )));
			}
			// Primera carta usuario
			for (int i = 0; i < 1; i++) {
				car[i] = (int) (Math.random() * 52 + 1);			
				if (car[i]>=10&&car[i]<=13||car[i]>=23&&car[i]<=26||car[i]>=36&&car[i]<=39||car[i]>=49&&car[i]<=52) {				
					valor = 10;								
				}  else if (car[i]==1||car[i]==14||car[i]==27||car[i]==40) {
					valor = 11;								
				} else if (car[i]>=2&&car[i]<=9){
					valor = car [i];								
				} else if (car[i]>=15&&car[i]<=22) {	
					valor = car[i] - 13;				
				} else if (car[i]>=28&&car[i]<=35) {	
					valor = car[i] - 26;				
				} else if (car[i]>=41&&car[i]<=48) {	
					valor = car[i] - 39;				
				}			
				totusu=totusu+valor;
				JOptionPane.showMessageDialog(null, "Primera carta del jugador "+"\nTotal del jugador: " + totusu ,"Blackjack",JOptionPane.DEFAULT_OPTION,
						new ImageIcon(Blackjack.class.getResource("/img/c" +car[i]+ ".jpg" )));
			}
			// Segunda carta de la banca escondida
			for (int i = 0; i < 1; i++) {
				car[i] = (int) (Math.random() * 52 + 1);			
				if (car[i]>=10&&car[i]<=13||car[i]>=23&&car[i]<=26||car[i]>=36&&car[i]<=39||car[i]>=49&&car[i]<=52) {				
					valor = 10;				
				} else if (car[i]==1&&totmaq<=10||car[i]==14 && totmaq<=10||car[i]==27 && totmaq<=10||car[i]==40&&totmaq<=10) {
					valor = 11;				
				} else if (car[i]==1&&totmaq>=11||car[i]==14 &&totmaq>=11||car[i]==27&&totmaq>=11||car[i]==40&&totmaq>=11) {
					valor = 1;				
				} else if (car[i]>=2&&car[i]<=9){
					valor = car [i];				
				} else if (car[i]>=15&&car[i]<=22) {	
					valor = car[i] - 13;				
				} else if (car[i]>=28&&car[i]<=35) {	
					valor = car[i] - 26;				
				} else if (car[i]>=41&&car[i]<=48) {	
					valor = car[i] - 39;				
				}	
				hid=car[i];			
				totmaq=totmaq+valor;
				JOptionPane.showMessageDialog(null, "Segunda carta de la banca escondida ","Blackjack",JOptionPane.DEFAULT_OPTION,
						new ImageIcon(Blackjack.class.getResource("/img/vuelta.jpg" )));
			}		
			// Segunda carta usuario
			for (int i = 0; i < 1; i++) {
				car[i] = (int) (Math.random() * 52 + 1);			
				if (car[i]>=10&&car[i]<=13||car[i]>=23&&car[i]<=26||car[i]>=36&&car[i]<=39||car[i]>=49&&car[i]<=52) {
					valor = 10;								
				} else if (car[i] == 1 && totusu <=10 || car[i] == 14 && totusu<=10 || car [i] == 27 && totusu<=10 || car [i] == 40 && totusu<=10) {
					valor = 11;							
				} else if (car[i] == 1 && totusu >=11 || car[i] == 14 && totusu>=11 || car [i] == 27 && totusu>=11 || car [i] == 40 && totusu>=11) {
					valor = 1;								
				} else if (car[i]>=2&&car[i]<=9){
					valor = car [i];								
				} else if (car[i]>=15&&car[i]<=22) {	
					valor = car[i] - 13;				
				} else if (car[i]>=28&&car[i]<=35) {	
					valor = car[i] - 26;				
				} else if (car[i]>=41&&car[i]<=48) {	
					valor = car[i] - 39;				
				}
				totusu=totusu+valor;
				JOptionPane.showMessageDialog(null, "Segunda carta del jugador "+"\nTotal del jugador: " + totusu ,"Blackjack",JOptionPane.DEFAULT_OPTION,
						new ImageIcon(Blackjack.class.getResource("/img/c" +car[i]+ ".jpg" )));			
			}		
			if (totusu==21) {
				apu=apu*3;
				gana=apu;
				JOptionPane.showMessageDialog(null, "El jugador hizo Blackjack y gano la partida!\nGano el triple de su apuesta! $"+gana ,"Blackjack",JOptionPane.DEFAULT_OPTION,
						new ImageIcon(Blackjack.class.getResource("/img/gan.gif" )));							
			} else if (totusu<21) {	
				sigue=(String)JOptionPane.showInputDialog(null, "Total del jugador: " + totusu + "\nTotal de la banca: " + c1 + " y una carta escondida" + "\nSaca otra carta? \nSi: Saca otra carta \nNo: Se planta","Blackjack", JOptionPane.DEFAULT_OPTION,
						new ImageIcon(Blackjack.class.getResource("/img/inc.gif")), null, null);			
					while (sigue.equalsIgnoreCase("si")&&totusu<21) {
						for (int i = 0; i < 1; i++) {
							car[i] = (int) (Math.random() * 52 + 1);						
							if (car[i]>=10&&car[i]<=13||car[i]>=23&&car[i]<=26||car[i]>=36&&car[i]<=39||car[i]>=49&&car[i]<=52) {
								valor = 10;								
							} else if (car[i] == 1 && totusu <=10 || car[i] == 14 && totusu<=10 || car [i] == 27 && totusu<=10 || car [i] == 40 && totusu<=10) {
								valor = 11;							
							} else if (car[i] == 1 && totusu >=11 || car[i] == 14 && totusu>=11 || car [i] == 27 && totusu>=11 || car [i] == 40 && totusu>=11) {
								valor = 1;								
							} else if (car[i]>=2&&car[i]<=9){
								valor = car [i];								
							} else if (car[i]>=15&&car[i]<=22) {	
								valor = car[i] - 13;				
							} else if (car[i]>=28&&car[i]<=35) {	
								valor = car[i] - 26;				
							} else if (car[i]>=41&&car[i]<=48) {	
								valor = car[i] - 39;				
							}
							totusu=totusu+valor;
							JOptionPane.showMessageDialog(null, "Nueva carta del jugador "+"\nTotal del jugador: " + totusu ,"Blackjack",JOptionPane.DEFAULT_OPTION,
									new ImageIcon(Blackjack.class.getResource("/img/c" +car[i]+ ".jpg" )));
						}
						if (totusu<21) {
							sigue=(String)JOptionPane.showInputDialog(null, "Total del jugador: " + totusu + "\nTotal de la banca: " + c1 + " y una carta escondida" + "\nSaca otra carta? Si/No \nSi: Saca otra carta \nNo: Se planta","Blackjack", JOptionPane.DEFAULT_OPTION,
									new ImageIcon(Blackjack.class.getResource("/img/inc.gif")), null, null);
						}					
					} 
					if (sigue.equalsIgnoreCase("no")) {
						JOptionPane.showMessageDialog(null, "El jugador se planto! Su puntaje total es: " +totusu ,"Blackjack",JOptionPane.DEFAULT_OPTION,
								new ImageIcon(Blackjack.class.getResource("/img/bj1.jpg" )));					
					}
					if (totusu==21) {
						apu=apu*3;
						gana=apu;
						JOptionPane.showMessageDialog(null, "El jugador hizo Blackjack y gano la partida!\nGano el triple de su apuesta! $"+gana ,"Blackjack",JOptionPane.DEFAULT_OPTION,
								new ImageIcon(Blackjack.class.getResource("/img/gan.gif" )));			
					}
				}		
			if (totusu>21) {
				JOptionPane.showMessageDialog(null, "El jugador se paso de 21 y perdio todo su dinero!" ,"Blackjack",JOptionPane.DEFAULT_OPTION,
						new ImageIcon(Blackjack.class.getResource("/img/perde.gif" )));			
			} else if (totusu<21&&totmaq>totusu&&totmaq<=21) {
				JOptionPane.showMessageDialog(null, "Carta escondida de la banca \nEl total de la banca es: " +totmaq ,"Blackjack",JOptionPane.DEFAULT_OPTION,
						new ImageIcon(Blackjack.class.getResource("/img/c" +hid+ ".jpg" )));
				JOptionPane.showMessageDialog(null, "Gano la banca y perdiste tu dinero! \nResultado final: \nBanca: " +totmaq+ " vs " + "Jugador: " +totusu ,"Blackjack",JOptionPane.DEFAULT_OPTION,
						new ImageIcon(Blackjack.class.getResource("/img/perde.gif" )));			
			} else if (totusu<21&&totmaq<totusu&&totmaq>16) {
				apu=apu*2;
				gana=apu;
				JOptionPane.showMessageDialog(null, "Carta escondida de la banca \nEl total de la banca es: " +totmaq ,"Blackjack",JOptionPane.DEFAULT_OPTION,
						new ImageIcon(Blackjack.class.getResource("/img/c" +hid+ ".jpg" )));
				JOptionPane.showMessageDialog(null, "El jugador gano el doble de su apuesta!! $"+gana+ "\nResultado final: \nBanca: " +totmaq+ " vs " + "Jugador: " +totusu ,"Blackjack",JOptionPane.DEFAULT_OPTION,
						new ImageIcon(Blackjack.class.getResource("/img/gan2.gif" )));			
			} else if (totusu<21&&totmaq<totusu&&totmaq<=16) {	
				JOptionPane.showMessageDialog(null, "Carta escondida de la banca \nEl total de la banca es: " +totmaq ,"Blackjack",JOptionPane.DEFAULT_OPTION,
						new ImageIcon(Blackjack.class.getResource("/img/c" +hid+ ".jpg" )));
				JOptionPane.showMessageDialog(null, "La banca tiene " + totmaq + ", debe sacar otra carta y superar los 16 puntos!" ,"Blackjack",JOptionPane.DEFAULT_OPTION,
						new ImageIcon(Blackjack.class.getResource("/img/bj4.jpg" )));			
				while (totmaq<=16) {
					for (int i = 0; i < 1; i++) {
						car[i] = (int) (Math.random() * 52 + 1);					
						if (car[i]>=10&&car[i]<=13||car[i]>=23&&car[i]<=26||car[i]>=36&&car[i]<=39||car[i]>=49&&car[i]<=52) {
							valor = 10;								
						} else if (car[i]==1&&totmaq<=10||car[i]==14&&totmaq<=10||car[i]==27&&totmaq<=10||car[i]==40&&totmaq<=10) {
							valor = 11;							
						} else if (car[i]==1&&totmaq>=11||car[i]==14&&totmaq>=11||car[i]==27&&totmaq>=11||car[i]==40&&totmaq>=11) {
							valor = 1;								
						} else if (car[i]>=2&&car[i]<=9){
							valor = car [i];								
						} else if (car[i]>=15&&car[i]<=22) {	
							valor = car[i] - 13;				
						} else if (car[i]>=28&&car[i]<=35) {	
							valor = car[i] - 26;				
						}else if (car[i]>=41&&car[i]<=48) {	
							valor = car[i] - 39;				
						}
						totmaq=totmaq+valor;
						JOptionPane.showMessageDialog(null, "Nueva carta de la banca "+"\nTotal de la banca: " + totmaq + "\nTotal del jugador: " +totusu ,"Blackjack",JOptionPane.DEFAULT_OPTION,
								new ImageIcon(Blackjack.class.getResource("/img/c" +car[i]+ ".jpg" )));
					}
					if (totmaq<=16) {
						JOptionPane.showMessageDialog(null, "La banca tiene " + totmaq + ", debe sacar otra carta y superar los 16 puntos!" ,"Blackjack",JOptionPane.DEFAULT_OPTION,
								new ImageIcon(Blackjack.class.getResource("/img/bj4.jpg" )));
					} 
				}			
				if (totmaq<21&&totmaq>totusu) {	
					JOptionPane.showMessageDialog(null, "Gano la banca! \nResultado final: \nBanca: " +totmaq+ " vs " + "Jugador: " +totusu ,"Blackjack",JOptionPane.DEFAULT_OPTION,
							new ImageIcon(Blackjack.class.getResource("/img/perde.gif" )));						
				} else if (totmaq==21&&totmaq>totusu) {
					JOptionPane.showMessageDialog(null, "La banca hizo blackjack y gano la partida! \nResultado final: \nBanca: " +totmaq+ " vs " + "Banca: " +totusu ,"Blackjack",JOptionPane.DEFAULT_OPTION,
							new ImageIcon(Blackjack.class.getResource("/img/perde.gif" )));							
				} else if (totusu<=21&&totusu>totmaq) {
					apu=apu*2;
					gana=apu;
					JOptionPane.showMessageDialog(null, "Gano el jugador! Ganaste el doble de tu apuesta! $" +gana+ " \nResultado final: \nJugador: " +totusu+ " vs " + "Banca: " +totmaq ,"Blackjack",JOptionPane.DEFAULT_OPTION,
							new ImageIcon(Blackjack.class.getResource("/img/gan.gif" )));							
				} else if (totmaq>21) {
					apu=apu*2;
					gana=apu;
					JOptionPane.showMessageDialog(null, "La banca se paso de 21 y gano el jugador!! Ganaste el doble de tu apuesta! $" +gana+ "\nResultado final: \nJugador: " +totusu+ " vs " + "Banca: " +totmaq ,"Blackjack",JOptionPane.DEFAULT_OPTION,
							new ImageIcon(Blackjack.class.getResource("/img/gan2.gif" )));								
				} else if (totusu==totmaq) {				
					JOptionPane.showMessageDialog(null, "Hay empate y se le devuelve el dinero al jugador! \nResultado final: \nJugador: " +totusu+ " vs " + "Banca: " +totmaq ,"Blackjack",JOptionPane.DEFAULT_OPTION,
							new ImageIcon(Blackjack.class.getResource("/img/emp.gif" )));
				} 
			}
			preg=JOptionPane.showInputDialog("Quiere volver a jugar?");
	        } while (preg.equalsIgnoreCase("si"));
		break;
		default:JOptionPane.showMessageDialog(null, "Error de ingreso");
			break;
		}		
        
	}
}


