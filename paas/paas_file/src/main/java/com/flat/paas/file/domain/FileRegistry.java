package com.flat.paas.file.domain;

public class FileRegistry {
    // 文件MD5 >>>表字段 : FILEMD5
    private String filemd5;

    // 文件路径 >>>表字段 : FILE_PATH
    private String filePath;

    // 引用次数 >>>表字段 : RER_COUNT
    private Integer rerCount;

    // 文件大小 >>>表字段 : FILE_SIZE
    private String fileSize;

    public String getFilemd5() {
        return filemd5;
    }

    public void setFilemd5(String filemd5) {
        this.filemd5 = filemd5;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public Integer getRerCount() {
        return rerCount;
    }

    public void setRerCount(Integer rerCount) {
        this.rerCount = rerCount;
    }

    public String getFileSize() {
        return fileSize;
    }

    public void setFileSize(String fileSize) {
        this.fileSize = fileSize;
    }
}