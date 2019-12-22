package com.practice.mybatis.repository.rednet.entity;

public class ResourceWithBLOBs extends Resource {
    private String keywords;

    private String customLabels;

    private String description;

    private String transcodeOutputs;

    private String aiDetectLabels;

    private String aiFaceRecogLabels;

    private String aiObjectRecogLabels;

    private String aiAsrLabels;

    private String aiOcrLabels;

    private String aiNlpLabels;

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords == null ? null : keywords.trim();
    }

    public String getCustomLabels() {
        return customLabels;
    }

    public void setCustomLabels(String customLabels) {
        this.customLabels = customLabels == null ? null : customLabels.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getTranscodeOutputs() {
        return transcodeOutputs;
    }

    public void setTranscodeOutputs(String transcodeOutputs) {
        this.transcodeOutputs = transcodeOutputs == null ? null : transcodeOutputs.trim();
    }

    public String getAiDetectLabels() {
        return aiDetectLabels;
    }

    public void setAiDetectLabels(String aiDetectLabels) {
        this.aiDetectLabels = aiDetectLabels == null ? null : aiDetectLabels.trim();
    }

    public String getAiFaceRecogLabels() {
        return aiFaceRecogLabels;
    }

    public void setAiFaceRecogLabels(String aiFaceRecogLabels) {
        this.aiFaceRecogLabels = aiFaceRecogLabels == null ? null : aiFaceRecogLabels.trim();
    }

    public String getAiObjectRecogLabels() {
        return aiObjectRecogLabels;
    }

    public void setAiObjectRecogLabels(String aiObjectRecogLabels) {
        this.aiObjectRecogLabels = aiObjectRecogLabels == null ? null : aiObjectRecogLabels.trim();
    }

    public String getAiAsrLabels() {
        return aiAsrLabels;
    }

    public void setAiAsrLabels(String aiAsrLabels) {
        this.aiAsrLabels = aiAsrLabels == null ? null : aiAsrLabels.trim();
    }

    public String getAiOcrLabels() {
        return aiOcrLabels;
    }

    public void setAiOcrLabels(String aiOcrLabels) {
        this.aiOcrLabels = aiOcrLabels == null ? null : aiOcrLabels.trim();
    }

    public String getAiNlpLabels() {
        return aiNlpLabels;
    }

    public void setAiNlpLabels(String aiNlpLabels) {
        this.aiNlpLabels = aiNlpLabels == null ? null : aiNlpLabels.trim();
    }
}