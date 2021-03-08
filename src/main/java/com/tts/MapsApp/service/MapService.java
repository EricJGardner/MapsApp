package com.tts.MapsApp.service;

import com.tts.MapsApp.model.Location;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

//@Service
public interface MapService {
    void addCoordinates(Location location);
}