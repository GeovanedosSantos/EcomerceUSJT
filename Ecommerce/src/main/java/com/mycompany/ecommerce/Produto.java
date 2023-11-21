
package com.mycompany.ecommerce;

public class Produto {

    /**
     * @return the tipoproduto
     */
    public int getTipoproduto() {
        return tipoproduto;
    }

    /**
     * @param tipoproduto the tipoproduto to set
     */
    public void setTipoproduto(int tipoproduto) {
        this.tipoproduto = tipoproduto;
    }

    /**
     * @return the precoproduto
     */
    public double getPrecoproduto() {
        return precoproduto;
    }

    /**
     * @param precoproduto the precoproduto to set
     */
    public void setPrecoproduto(double precoproduto) {
        this.precoproduto = precoproduto;
    }

    /**
     * @return the nomeproduto
     */
    public String getNomeproduto() {
        return nomeproduto;
    }

    /**
     * @param nomeproduto the nomeproduto to set
     */
    public void setNomeproduto(String nomeproduto) {
        this.nomeproduto = nomeproduto;
    }
    private int quantidadeproduto;
    private int tipoproduto;
    private double precoproduto;
    private String nomeproduto;
    
    public Produto(int tipoproduto,double precoproduto,String nomeproduto){
        setTipoproduto(tipoproduto);
        setPrecoproduto(precoproduto);
        setNomeproduto(nomeproduto);
        
    }
}
