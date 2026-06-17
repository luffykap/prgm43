package com.luffy;

/**
 * Hello world!
 */
import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.IOException;
import com.google.common.collect.ImmutableList;
public class App {
    public static void main(String[] args) {
        ImmutableList<String> fruits=ImmutableList.of("apple","banana");
        System.out.println(fruits);
        
        File sourceFile= new File("source.txt");
        File destFile= new File("destination.txt");
        
        try{
		FileUtils.copyFile(sourceFile,destFile);
		System.out.println("suucees");
	}catch(IOException e){
		System.err.println(e);
	};
    }
}
