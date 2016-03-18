package com.springinaction.springidol.models.performers;

import com.springinaction.springidol.models.props.Instrument;
import com.springinaction.springidol.util.PerformanceException;

import java.util.Map;

public class OneManBand implements Performer {
    public OneManBand() {
    }

    public void perform() throws PerformanceException {

        System.out.println("Song: " + song);

        for (String key : instruments.keySet()) {
            System.out.print(key + " : ");
            Instrument instrument = instruments.get(key);
            instrument.play();
        }
    }

    private String song;

    public void setSong(String song) {
        this.song = song;
    }

    private Map<String, Instrument> instruments;

    public void setInstruments(Map<String, Instrument> instruments) {
        this.instruments = instruments; // Внедрение коллекции инструментов
    }
}