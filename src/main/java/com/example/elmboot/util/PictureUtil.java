package com.example.elmboot.util;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;


public class PictureUtil {
    /**
     * 通过读取文件并获取其width及height的方式，来判断判断当前文件是否图片，这是一种非常简单的方式。
     * @param imageFile
     * @return
     */
    public static boolean isImage(File imageFile) {
        if (!imageFile.exists()) {
            return false;
        }
        Image img = null;
        try {
            img = ImageIO.read(imageFile);
            if (img == null || img.getWidth(null) <= 0 || img.getHeight(null) <= 0) {
                return false;
            }
            return true;
        } catch (Exception e) {
            return false;
        } finally {
            img = null;
        }
    }

    public static boolean isImage(InputStream inputStream) throws IOException {
        if (inputStream == null) {
            return false;
        }
        Image img = null;
        try {
            img = ImageIO.read(inputStream);
            if (img == null || img.getWidth(null) <= 0 || img.getHeight(null) <= 0) {
                return false;
            }
            return true;
        } catch (Exception e) {
            return false;
        } finally {
            img = null;
            inputStream.close();
        }
    }
}
