package com.example.elmboot.util;

import java.io.InputStream;
import java.io.OutputStream;

public class UrlParse {

    /**
     * 获取 URL 里的后缀名信息 .jpg
     *
     * @param url
     * @return
     */
    public String urlSuffix(String url) {
        int p1 = url.lastIndexOf('/');
        if (p1 < 0) p1 = 0; // 如果没有/，则从头开始检查

        int p2 = url.indexOf('.', p1 + 1);
        if (p2 > 0) {
            return url.substring(p2);
        }

        return "";
    }

    private long streamCopy(InputStream in, OutputStream out) throws Exception {
        long count = 0;
        byte[] buf = new byte[8192];
        while (true) {
            int n = in.read(buf);
            if (n < 0)
                break;
            if (n == 0)
                continue;
            out.write(buf, 0, n);

            count += n;
        }
        return count;
    }

    /**
     * 根据后缀名，推算 Content-Type
     *
     * @param suffix
     * @return
     */
    public String getContentType(String suffix) {
        suffix = suffix.toLowerCase();
        if (suffix.equals(".jpg")) return "image/jpeg";
        if (suffix.equals(".jpeg")) return "image/jpeg";
        if (suffix.equals(".png")) return "image/png";
        if (suffix.equals(".gif")) return "image/gif";
        if (suffix.equals(".html")) return "text/html";
        if (suffix.equals(".txt")) return "text/plain";
        if (suffix.equals(".js")) return "application/javascript";
        if (suffix.equals(".mp4")) return "video/mp4";

        return "application/octet-stream"; // 一般的二进制文件类型
    }

}
