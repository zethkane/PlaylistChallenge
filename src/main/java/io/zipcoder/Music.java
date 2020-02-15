package io.zipcoder;

public class Music {

    private String[] playList;

    public Music(String[] playList) {
        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection) {
        int back = 0;
        int forward = 0;
        int index = startIndex;
        while (playList[index] != selection) {
            if (index == playList.length) {
                index = 0;
                forward++;
            } else {
                index++;
                forward++;
            }
        }
        while (playList[startIndex] != selection) {
            if (startIndex == 0) {
                startIndex = playList.length - 1;
                back++;
            } else {
                startIndex--;
                back++;
            }
        }
        if (forward < back) {
            return forward;
        } else {
            return back;
        }

    }
}