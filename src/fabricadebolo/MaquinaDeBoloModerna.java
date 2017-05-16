package fabricadebolo;
public class MaquinaDeBoloModerna extends MaquinaDeBolo{
 @Override
  public void fazerBolo(String Sabor){
      this.sabor = Sabor;
      System.out.println("Bolo feito com sucesso!Sabor "+this.sabor);
  }    
  public void fazerBolo(String sabor,String recheio){
      this.sabor = sabor;
      setRecheio(recheio);
      System.out.println("Bolo de "+ this.sabor +" com recheio de "+ getRecheio() +" ,feito!");
  }
  public void fazerBolo(String sabor,String recheio,String cobertura){
      this.sabor = sabor;
      setRecheio(recheio); 	
      this.cobertura = cobertura;
      System.out.println("Bolo de "+this.sabor +" com recheio de "+ getRecheio() +" e cobertura de "+ this.cobertura +" ,feito!");
  }


}	
    

