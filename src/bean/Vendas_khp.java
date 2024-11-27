/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bean;

/**
 *
 * @author kende
 */
public class Vendas_khp {
    
    private int id_vendas_khp;
    private int fk_cliente_khp;
    private String data_venda_khp;
    private int valor_total_khp;
    private int forma_de_pagamento_khp;
    private int fk_vendedores_khp;
    /**
     * @return the id_vendas_khp
     */
    public int getId_vendas_khp() {
        return id_vendas_khp;
    }

    /**
     * @param id_vendas_khp the id_vendas_khp to set
     */
    public void setId_vendas_khp(int id_vendas_khp) {
        this.id_vendas_khp = id_vendas_khp;
    }

    /**
     * @return the fk_cliente_khp
     */
    public int getFk_cliente_khp() {
        return fk_cliente_khp;
    }

    /**
     * @param fk_cliente_khp the fk_cliente_khp to set
     */
    public void setFk_cliente_khp(int fk_cliente_khp) {
        this.fk_cliente_khp = fk_cliente_khp;
    }

    /**
     * @return the data_venda_khp
     */
    public String getData_venda_khp() {
        return data_venda_khp;
    }

    /**
     * @param data_venda_khp the data_venda_khp to set
     */
    public void setData_venda_khp(String data_venda_khp) {
        this.data_venda_khp = data_venda_khp;
    }

    /**
     * @return the valor_total_khp
     */
    public int getValor_total_khp() {
        return valor_total_khp;
    }

    /**
     * @param valor_total_khp the valor_total_khp to set
     */
    public void setValor_total_khp(int valor_total_khp) {
        this.valor_total_khp = valor_total_khp;
    }

    /**
     * @return the forma_de_pagamento_khp
     */
    public int getForma_de_pagamento_khp() {
        return forma_de_pagamento_khp;
    }

    /**
     * @param forma_de_pagamento_khp the forma_de_pagamento_khp to set
     */
    public void setForma_de_pagamento_khp(int forma_de_pagamento_khp) {
        this.forma_de_pagamento_khp = forma_de_pagamento_khp;
    }

    /**
     * @return the fk_vendedores_khp
     */
    public int getFk_vendedores_khp() {
        return fk_vendedores_khp;
    }

    /**
     * @param fk_vendedores_khp the fk_vendedores_khp to set
     */
    public void setFk_vendedores_khp(int fk_vendedores_khp) {
        this.fk_vendedores_khp = fk_vendedores_khp;
    }
    
}

   