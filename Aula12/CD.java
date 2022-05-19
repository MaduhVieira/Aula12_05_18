package Aula12;

import java.util.Scanner;

public class CD extends Midia{
    
    private int nMusicas;
    //Construtor sem parametros
    public CD()
    {
        //Chamada ao construtor com parametro
        this(0, 0.0, "Nenhum", 0);
    }
    //construtor com parametro
    public CD(int codigo, double preco, String name, int nMusicas)
    {
        //Chamada ao cosntrutor da classe Midia
        super(codigo, preco, name);
        setMusica(nMusicas);
    }
    //Função para impressao do tipo
    public String geTipo()
    {
        return "CD: ";     
    }

    //Função que  retorna o conteudo do campos desta classe e da classe Midia(usando super !)
    public String getDetalhes() 
    {
        return super.getDetalhes() + "\n" + "Numero de musicas" + nMusicas + "\n";
    }
    public void setMusica(int nmus)
    {
        nMusicas = (nmus > 0) ? nmus : 0;
    }
    
    //Função para leitura dos dados via teclado dos campos desta
    //classe e dos campos da classe  Midia (usando super !)
    public void inserirDados()
    {
        //Leitura dos dados dos campos pertecentes a classe Midia 
        super.inserirDados();
        Scanner in = new Scanner(System.in);
        System.out.printf("\n Entre com o numero de musicas: ");
        int nmus = in.nextInt();
        setMusica(nmus);
    }


}
