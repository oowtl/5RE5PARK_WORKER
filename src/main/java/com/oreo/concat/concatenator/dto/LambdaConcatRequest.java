package com.oreo.concat.concatenator.dto;

import java.util.List;

public class LambdaConcatRequest {
    private ConcatTabResponseDto concatTabResponseDto;
    private AudioFormatDto audioFormatDto;
    private List<ConcatRowRequest> audios;
    private String fileName;

    public LambdaConcatRequest() {
    }

    public LambdaConcatRequest(ConcatTabResponseDto concatTabResponseDto, AudioFormatDto audioFormatDto,
                               List<ConcatRowRequest> audios, String fileName) {
        this.concatTabResponseDto = concatTabResponseDto;
        this.audioFormatDto = audioFormatDto;
        this.audios = audios;
        this.fileName = fileName;
    }

    public List<ConcatRowRequest> getAudios() {
        return audios;
    }

    public void setAudios(List<ConcatRowRequest> audios) {
        this.audios = audios;
    }

    public AudioFormatDto getAudioFormatDto() {
        return audioFormatDto;
    }

    public void setAudioFormatDto(AudioFormatDto audioFormatDto) {
        this.audioFormatDto = audioFormatDto;
    }

    public ConcatTabResponseDto getConcatTabResponseDto() {
        return concatTabResponseDto;
    }

    public void setConcatTabResponseDto(ConcatTabResponseDto concatTabResponseDto) {
        this.concatTabResponseDto = concatTabResponseDto;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
}