package com.wqs.jsd;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

/**
 * @Author: wan
 * @Date: Created in 19:20 2020/3/5
 * @Description:
 * @Modified By:
 */
public class CreateMethods {
    private List<String> list;

    public static void main(String[] args) {
//        CreateFile("a", "b");
        CreateService();
        CreateServiceImpl();
    }

    private static void CreateService() {
    }

    private static void CreateServiceImpl() {
    }

    private static void CreateFile(String s1, List<String> list) throws IOException {
        for (String s : list) {
            String mkDirectoryPath = System.getProperty("user.dir") + "\\src\\main\\java\\com\\wqs\\jsd\\" + s1 + s + ".java";
            System.out.println(mkDirectoryPath);
            File file = new File(mkDirectoryPath);
            File fileParent = file.getParentFile();
            if (!fileParent.exists()) {
                fileParent.mkdirs();
            }
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(mkDirectoryPath);
        }
    }
}
