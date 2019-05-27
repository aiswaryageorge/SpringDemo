package com.stackroute.awareinterface;

import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.ResourceLoader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ResourcesLoaderAwareDemo implements ResourceLoaderAware {
    @Override
    public void setResourceLoader(ResourceLoader resourceLoader) {
        try (FileReader fr = new FileReader("/home/aiswarya/stackroute/MovieActor/src/main/resources/data.txt");
             BufferedReader br = new BufferedReader(fr)) {
            StringBuilder fullText = new StringBuilder();
            for (String line; (line = br.readLine()) != null; fullText.append(line)) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
      System.out.println("ResourcesLoader is:" +resourceLoader);
    }
}
