package com.springinaction.springidol.models.performers;

import com.springinaction.springidol.util.PerformanceException;

public interface Performer {
    void perform() throws PerformanceException;
}