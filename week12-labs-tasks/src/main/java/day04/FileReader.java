package day04;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class FileReader {

    public List<SubjectPost> readInFromFile(Path path) {
        String line;
        List<SubjectPost> subjectPostList = new ArrayList<>();
        String[] tempArr = new String[4];
        try (BufferedReader br = Files.newBufferedReader(path)) {
            int counter = 0;
            while ((line = br.readLine()) != null) {
                // subjectPostList.add(new SubjectPost(line, br.readLine(),br.readLine(),Integer.parseInt(br.readLine())));
                tempArr[counter] = line.trim();
                counter++;
                if (counter == 4) {
                    subjectPostList.add(new SubjectPost(tempArr[0], tempArr[1], tempArr[2], Integer.parseInt(tempArr[3])));
                    counter = 0;
                }
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
        return subjectPostList;
    }

    public int sumLessons(List<SubjectPost> sjList, String teacher){
        int sum = 0;
        for (SubjectPost sp:sjList){
            if (sp.getName().equals(teacher)){
                sum+=sp.getLessonByWeek();
            }
        }
        return sum;
    }
}
