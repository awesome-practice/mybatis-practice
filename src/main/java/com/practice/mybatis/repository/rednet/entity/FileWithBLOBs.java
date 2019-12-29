package com.practice.mybatis.repository.rednet.entity;

public class FileWithBLOBs extends File {
    private String toTypes;

    private String dirPath;

    private String aiAnalyseStates;

    public String getToTypes() {
        return toTypes;
    }

    public void setToTypes(String toTypes) {
        this.toTypes = toTypes == null ? null : toTypes.trim();
    }

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