import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> lista = new ArrayList<String>();
        List<String> nombrePartido = new ArrayList<String>();
        List<String> resultPartido = new ArrayList<String>();
        List<String> nombreJugador = new ArrayList<String>();
        List<String> pronosticoPartido = new ArrayList<String>();

        Path partidos = Paths.get("src/partidos");
        Path pronosticos = Paths.get("src/pronosticos");


        try {
            List<String> readALlLines = Files.readAllLines(partidos);
            for(String line : readALlLines) {

                String[] res = line.split(";");
                nombrePartido.add(res[0]);
                resultPartido.add(res[1]);

                // Imprime sólo los resultados del partido: 1 gana local, 0 empate, 2 gana visitante
                System.out.println(res[1]);

            }
        } catch (IOException e) {
            System.out.println("Error leyendo archivo");

        }

        try {
            List<String> readALlLines = Files.readAllLines(pronosticos);
            for(String line : readALlLines) {

                String[] pro = line.split(";");
                nombreJugador.add(pro[0]);
                nombrePartido.add(pro[1]);
                pronosticoPartido.add(pro[2]);

                // Imprime sólo los pronosticos del partido: 1 gana local, 0 empate, 2 gana visitante
                System.out.println(pro[2]);

            }
        } catch (IOException e) {
            System.out.println("Error leyendo archivo");

        }



    }
}

