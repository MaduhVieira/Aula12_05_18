package Aula12;

import java.util.Scanner;

public class DVD extends Midia{
    
    private int nFaixas;

    //Construtor sem parametros
    public DVD()
    {
        this(0, 0.0, "Nenhum", 0);
        //Chamda ao construtor com parametro
    }
    //Construtor com parametros
    public DVD(int codigo, double preco, String name, int nFaixas)
    {
        super(codigo, preco, name); //chamada ao construtor da classe Midia

        setFaixas(nFaixas);
    }
    //função para impressao do tipo 
    public String getTipo()
    {
        return "DVD: ";
    }

    //função que retorna o conteudo do campos desta
    //classe e da classe Midia (usando super !)
    public String getDetalhes()
    {
        return super.getDetalhes() + "\n" + "Numero de musicas" + nFaixas + "\n";
    }
    public void setFaixas(int nfaix)
    {
        nFaixas = (nfaix > 0) ? nfaix : 0;
    }
    //função para leitura dos dados via teclado dos campos desta
    //classe e dos campos da classe Midia (usando super !)
    public void inserirDados()
    {
        //Leitura dos dados dos campos pertecentes a classe Midia 
        super.inserirDados();
        Scanner in = new Scanner(System.in);
        System.out.printf("\n Entre com o numero de faixas: ");
        int nfaix = in.nextInt();
        setFaixas(nfaix);
    }


}
