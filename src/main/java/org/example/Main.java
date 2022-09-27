package org.example;

import static spark.Spark.*;
import org.tinylog.Logger;

public class Main {
    public static void main(String[] args) {
        get("/provaciaomondo", (req, res) -> "Ciao Mondo");
        Logger.info("Ciao Mondo");
    }
}