package entities;

public class PessoaJurica extends Contribuinte{
	
	private Integer employee;
	
	public PessoaJurica() {
		super();
	}
	
	
	public PessoaJurica(String name, Double rendaAnual, Integer employee) {
		super(name, rendaAnual);
		this.employee = employee;
	}

	
	public Integer getEmployee() {
		return employee;
	}


	public void setEmployee(Integer employee) {
		this.employee = employee;
	}


	@Override
	public Double taxesPaid() {
		// TODO Auto-generated method stub
		return null;
	}

}
