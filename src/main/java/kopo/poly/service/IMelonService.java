package kopo.poly.service;

import kopo.poly.dto.MelonDTO;

import java.util.List;

public interface IMelonService {

    /**
     * 멜론 노래 리스트 저장하기
     */
    int collectMelonSong() throws Exception;

    /**
     * 오늘 수집된 멜론 노래리스트 가져오기
     */
    List<MelonDTO> getSongList() throws Exception;

    /**
     * 멜론 가수별 노래 수 가져오기
     */
    List<MelonDTO> getSingerSongCnt() throws Exception;

    List<MelonDTO> getSingerSong() throws Exception;

    int collectMelonSongMany() throws Exception;

    int updateBTSName() throws Exception;

    int deleteSong() throws Exception;

    int updateAddBTSNickname() throws Exception;

    int updateAddBTSMember() throws Exception;

    int updateManySong() throws Exception;

    int deleteOne() throws Exception;
}
