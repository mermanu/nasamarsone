/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nasa.marsapi.comunicator;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * File reader/writer implementation
 *
 * @author manuelmerida
 */
public class FileReader {

    /**
     * Get the content of a defined file
     *
     * @param filePath
     * @return
     * @throws Exception
     */
    public static String getFileContent(String filePath) throws Exception {
        BufferedReader br = null;
        FileInputStream fis = null;
        String content = null;
        String tmp = null;
        try {
            fis = new FileInputStream(filePath);
            br = new BufferedReader(new InputStreamReader(fis));
            int i = 0;
            while ((tmp = br.readLine()) != null) {
                if (tmp != null) {
                    content = tmp;
                }
            }
        } catch (Exception e) {
            throw e;
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
                if (fis != null) {
                    fis.close();
                }
            } catch (IOException ex) {
                throw ex;
            }
        }
        return content;
    }

    /**
     * Set the content of a defined file
     *
     * @param message
     * @param filePath
     * @throws Exception
     */
    public static void setFileContent(String message, String filePath) throws Exception {
        PrintWriter writer = new PrintWriter(filePath);
        writer.println(message);
        writer.close();
    }
}
