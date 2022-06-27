package by.itacademy.javase.lecture12.classfile;

import java.io.File;

public class FileDemo {

    public static void main(String[] args) {
        File file = new File("C:\\temp");
        System.out.println(file.exists());
        System.out.println(file.isDirectory());
        System.out.println(file.isFile());
        System.out.println(file.isAbsolute());
        System.out.println(file.isHidden());

        if (file.isDirectory()) {
            for (File listFile : file.listFiles()) {
                System.out.println(listFile.getName());
            }
        }

        File file1 = new File("C:\\temp\\newdir");
        System.out.println(file1.mkdir());

        System.out.println(file1.renameTo(new File("C:\\temp\\new")));
    }
}
