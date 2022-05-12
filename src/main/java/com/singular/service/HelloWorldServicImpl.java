package com.singular.service;

import com.singular.repository.HelloWorldRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
class HelloWorldServiceImpl implements HelloWorldService{
    private final HelloWorldRepository hw;
    private int counter=load();

    @Override
    public String getHelloWorld() {
        counter++;
        save();
        return hw.getHelloWorld() + " is run " + " " + counter + "times";
    }
    private void save() {
        List<String> lines = new ArrayList<>();
        String line = Integer.toString(counter);

        lines.add(line);
        try {
            Files.write(Paths.get("src/counter.txt"), lines);
        } catch (Exception e) {
            System.out.println("File " + "src/counter.txt" + " not found.");
        }
    }
    private int load() {
        try {
            List<String> lines = Files.readAllLines(Paths.get("src/counter.txt"));
            for (String line : lines) {
                if (line == null) {
                    return 0;
                }
                counter = Integer.parseInt(line);
            }
            return counter;
        } catch (Exception e) {
            System.out.println("File " + "src/counter.txt" + " not found.");
        }
        return 0;
    }
}
