package entities;

public class PessoaFisica extends Contribuinte{
	
	private Double health;
	
	public PessoaFisica() {
		super();
	}
	
	
	
	public PessoaFisica(String name, Double rendaAnual, Double health) {
		super(name, rendaAnual);
		this.health = health;
	}

	

	public Double getHealth() {
		return health;
	}



	public void setHealth(Double health) {
		this.health = health;
	}



	@Override
	public Double taxesPaid() {
		return (rendaAnual * 0.25) - (health * 0.50) ;
	}

}
