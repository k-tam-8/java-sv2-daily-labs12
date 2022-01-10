package day01;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Running {

    private List<Run> runList = new ArrayList<>();

    public List<String> readInFromFile(Path path) {
        String line = "";
        List<String> readIn = new LinkedList<>();
        try (BufferedReader br = Files.newBufferedReader(path)) {
            br.readLine(); //első sor kihagyása
            while (br.readLine() != null) {
                makeRun(line);
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
        return readIn;
    }

    private Run makeRun(String line) {
        String[] strArr = line.split(";");
        return new Run(Double.parseDouble(strArr[0].split(" ")[0]), LocalDate.parse(strArr[1].trim()));
    }

    public double monthlyRunPerf(LocalDate dateIn) {
        double returnDouble = 0;
        for (Run r : runList) {
            if (r.getDate().getMonth() == dateIn.getMonth()) {
                returnDouble += r.getKm();
            }
        }
        return returnDouble;
    }
}
