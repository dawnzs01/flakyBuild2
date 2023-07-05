package com.ruiyun.example;

import com.ruiyun.jvppeteer.util.StreamUtil;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class ArchiveZipFileExample {

    public static void main(String[] args) throws IOException {
        extractZip("D:\\develop\\softwarePackage\\chrome-win.zip","D:\\develop\\softwarePackage");
    }
    private static void extractZip(String archivePath, String folderPath) throws IOException {
        BufferedOutputStream wirter = null;
        BufferedInputStream reader = null;
        ZipFile zipFile = new ZipFile(archivePath);
        Enumeration<? extends ZipEntry> entries = zipFile.entries();
        try {
            while (entries.hasMoreElements()){
                ZipEntry zipEntry = entries.nextElement();
                String name = zipEntry.getName();
                Path path = Paths.get(folderPath, name);
                if (zipEntry.isDirectory()){
                    path.toFile().mkdirs();
                }else{
                    reader = new BufferedInputStream(zipFile.getInputStream(zipEntry));
                    int bufferSize = 8192;
                    int perReadcount = -1;
                    byte[] buffer = new byte[bufferSize];
                    wirter = new BufferedOutputStream(new FileOutputStream(path.toString()));
                    while((perReadcount = reader.read(buffer,0,bufferSize)) != -1){
                        wirter.write(buffer, 0, perReadcount);
                    }
                    wirter.flush();
                }

            }
        } finally {
            StreamUtil.closeQuietly(wirter);
            StreamUtil.closeQuietly(reader);
            zipFile.close();
        }
    }
}
