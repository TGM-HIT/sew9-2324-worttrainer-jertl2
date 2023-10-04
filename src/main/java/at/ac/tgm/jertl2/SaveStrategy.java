package at.ac.tgm.jertl2;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public interface SaveStrategy {
    void save(JsonNode node, int richtigW, int falschW, ObjectMapper objectMapper) throws IOException;

    int[] load(JsonNode node) throws IOException;
}
