/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Milagre
 */
public class Tarefa {
    private int id, total_pendentes, total_concluidos, total_alocados, removidas;
    private String nome, descricao,data_criacao, data_vencimento,categoria,responsavel,estado,delete;

    public Tarefa(int id, int total_pendentes, int total_concluidos, int total_alocados, int removidas, String nome, String descricao, String data_criacao, String data_vencimento, String categoria, String responsavel, String estado, String delete) {
        this.id = id;
        this.total_pendentes = total_pendentes;
        this.total_concluidos = total_concluidos;
        this.total_alocados = total_alocados;
        this.removidas = removidas;
        this.nome = nome;
        this.descricao = descricao;
        this.data_criacao = data_criacao;
        this.data_vencimento = data_vencimento;
        this.categoria = categoria;
        this.responsavel = responsavel;
        this.estado = estado;
        this.delete = delete;
    }

    public int getRemovidas() {
        return removidas;
    }

    public void setRemovidas(int removidas) {
        this.removidas = removidas;
    }

    

    public String getDelete() {
        return delete;
    }

    public void setDelete(String delete) {
        this.delete = delete;
    }

  

    public int getTotal_pendentes() {
        return total_pendentes;
    }

    public void setTotal_pendentes(int total_pendentes) {
        this.total_pendentes = total_pendentes;
    }

    public int getTotal_concluidos() {
        return total_concluidos;
    }

    public void setTotal_concluidos(int total_concluidos) {
        this.total_concluidos = total_concluidos;
    }

    public int getTotal_alocados() {
        return total_alocados;
    }

    public void setTotal_alocados(int total_alocados) {
        this.total_alocados = total_alocados;
    }

 
    
    public Tarefa (){
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getData_criacao() {
        return data_criacao;
    }

    public void setData_criacao(String data_criacao) {
        this.data_criacao = data_criacao;
    }

    public String getData_vencimento() {
        return data_vencimento;
    }

    public void setData_vencimento(String data_vencimento) {
        this.data_vencimento = data_vencimento;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
  

    @Override
    public String toString() {
        return "Tarefa{" + "id=" + id + ", total_pendentes=" + total_pendentes + ", total_concluidos=" + total_concluidos + ", total_alocados=" + total_alocados + ", nome=" + nome + ", descricao=" + descricao + ", data_criacao=" + data_criacao + ", data_vencimento=" + data_vencimento + ", categoria=" + categoria + ", responsavel=" + responsavel + ", estado=" + estado + '}';
    }
  
    
}
