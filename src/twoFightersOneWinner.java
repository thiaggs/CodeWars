
public class twoFightersOneWinner {

	public static void main(String[] args) {
		int i = 0;
	    Fighter first;
	    Fighter second;
	    String vencedor;
	    
	    if(fighter1.name == firstAttacker){
	        first = fighter1;
	        second = fighter2;
	      }
	      else{
	        first = fighter2;
	        second = fighter1;
	      }
	      
	    while(i >= 0){
	      second.health -= first.damagePerAttack;
	      if(second.health <= 0){
	        break;
	      }
	      first.health -= second.damagePerAttack;
	      if(first.health <= 0){
	        break;
	      }
	      
	    }
	    vencedor = (first.health <= 0) ? second.name : first.name;
	    return vencedor

	}

}
