package br.com;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class LerCSV {
    public static void main(String[] args) {
        String arquivoCSV = "alunos.csv";

        try (CSVReader csvReader = new CSVReader(new FileReader(arquivoCSV))) {
            List<String[]> linhas = csvReader.readAll();

            // Exibindo o cabeçalho
            System.out.println("Conteúdo do arquivo CSV:");
            for (String[] linha : linhas) {
                for (String coluna : linha) {
                    System.out.print(coluna + "\t");
                }
                System.out.println();
            }
        } catch (IOException | CsvException e) {
            e.printStackTrace();
        }
    }
}
