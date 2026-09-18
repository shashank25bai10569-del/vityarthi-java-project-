package edu.ccrm.util;

import java.io.IOException;
import java.nio.file.*;

public class FileUtil {
    public static void backupFile(String fileName) throws IOException {
        Path src = Paths.get(fileName);
        Path dest = Paths.get("backup_" + System.currentTimeMillis() + "_" + fileName);
        Files.copy(src, dest, StandardCopyOption.REPLACE_EXISTING);
    }

    public static long folderSize(Path path) throws IOException {
        if (Files.isDirectory(path)) {
            long size = 0;
            try (var stream = Files.list(path)) {
                for (Path p : (Iterable<Path>) stream::iterator) {
                    size += folderSize(p); // recursion
                }
            }
            return size;
        } else {
            return Files.size(path);
        }
    }
}