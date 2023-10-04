package at.ac.tgm.jertl2;

import com.fasterxml.jackson.databind.JsonNode;

import java.io.IOException;

public interface SaveStrategy {
    void save(JsonNode node) throws IOException;
}
