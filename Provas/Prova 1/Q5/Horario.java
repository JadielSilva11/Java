public class Horario{
	int hora;	
	int minuto;
	int segundo;

	public Horario(){
		hora = 23;
		minuto = 59;
		segundo = 59;
	}	

	public Horario(int hora, int min, int seg){
		this.hora = hora;
		this.minuto = min;
		this.segundo = seg;
	}

	public boolean valida(){
		if((hora >= 0 && hora <= 23) &&
		  (minuto >=0 && minuto <= 59) && 
		  (segundo >= 0 && segundo <= 59)){
			return true;
		}
		else{
			return false;
		}
	}

	public String formata(){
		if(valida() == true){
			return String.format("%02d:%02d:%02d", hora, minuto , segundo);
		}
		else{
			return "Horario invalido!";
		}
	}

	public int compara(Horario outro){
		if(this.hora == outro.hora){
			return 0;
		}
		else if(this.hora > outro.hora){
			return 1;
		}
		else{
			return -1;
		}
	}

	
}