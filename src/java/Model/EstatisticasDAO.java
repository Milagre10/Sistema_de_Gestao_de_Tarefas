/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Milagre
 */
public class EstatisticasDAO {

    public ArrayList<Integer> getTotalTarefasPorEstado() throws SQLException {
        ArrayList<Integer> totalTarefas = new ArrayList<>();

        try ( Connection connection = ConexaoBD.getConectar();  Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery("SELECT COUNT(*) FROM tarefa WHERE estado = 'Pendente'");

            if (resultSet.next()) {
                int totalPendentes = resultSet.getInt(1);
                totalTarefas.add(totalPendentes);
            }

            resultSet = statement.executeQuery("SELECT COUNT(*) FROM tarefa WHERE estado = 'Concluido'");

            if (resultSet.next()) {
                int totalConcluidas = resultSet.getInt(1);
                totalTarefas.add(totalConcluidas);
            }
        }

        return totalTarefas;
    }

   public ArrayList<Tarefa> getTotal_ALOCADOS() throws SQLException {
    ArrayList<Tarefa> total_alocados = new ArrayList<>();

    try (Connection connection = ConexaoBD.getConectar(); Statement statement = connection.createStatement()) {
        ResultSet resultSet = statement.executeQuery("SELECT categoria, COUNT(*) AS total_alocadas\n"
                + "FROM tarefa\n"
                + "GROUP BY categoria\n"
                + "ORDER BY total_alocadas DESC");

        while (resultSet.next()) {
            String categoria = resultSet.getString("categoria");
            int total = resultSet.getInt("total_alocadas");

            Tarefa tarefa = new Tarefa();
            tarefa.setCategoria(categoria);
            tarefa.setTotal_alocados(total);

            total_alocados.add(tarefa);
        }
    }

    return total_alocados;
}
   public ArrayList<Integer> getTotalTarefasRemovidas() throws SQLException {
     ArrayList<Integer> total = new ArrayList<>();

    try (Connection connection = ConexaoBD.getConectar(); Statement statement = connection.createStatement()) {
        ResultSet resultSet = statement.executeQuery("SELECT COUNT(*) as removidas FROM tarefa WHERE apagar = 'Nao_Existe'");

         if (resultSet.next()) {
               
               int removidas = resultSet.getInt("removidas");
               Tarefa tarefa = new Tarefa();
               tarefa.setRemovidas(removidas);
               total.add(removidas);
            }
    }

    return total;
}

}
