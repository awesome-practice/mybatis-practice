package com.practice.mybatis.repository.rednet.entity;

public class FileWithBLOBs extends File {
    private String dirPath;

    private String aiAnalyseStates;

    public String getDirPath() {
        return dirPath;
    }

    public void setDirPath(String dirPath) {
        this.dirPath = dirPath == null ? null : dirPath.trim();
    }

    public String getAiAnalyseStates() {
        return aiAnalyseStates;
    }

    public void setAiAnalyseStates(String aiAnalyseStates) {
        this.aiAnalyseStates = aiAnalyseStates == null ? null : aiAnalyseStates.trim();
    }
}