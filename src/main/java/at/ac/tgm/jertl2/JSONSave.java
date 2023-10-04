package at.ac.tgm.jertl2;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

import java.io.File;
import java.io.IOException;

public class JSONSave implements SaveStrategy {

    @Override
    public void save(JsonNode node, int richtigW, int falschW, ObjectMapper objectMapper) throws IOException {
        ObjectNode statNode = (ObjectNode) node.path("Statistik");
        statNode.put("richtig", richtigW);
        statNode.put("falsch", falschW);
        objectMapper.writeValue(new File("C:\\Users\\jakob\\IdeaProjects\\WortTrainerReloaded\\src\\main\\java\\at\\ac\\tgm\\jertl2\\data.json"), node);
    }

    @Override
    public int[] load(JsonNode node) throws IOException {
        int[] werte = new int[2];
        JsonNode statistikNode = node.path("Statistik");
        werte[0] = statistikNode.get("richtig").asInt();
        werte [1] = statistikNode.get("falsch").asInt();
        return werte;
    }
}
