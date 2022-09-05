package org.example.tools;

public class ToolUtils {
    private ToolUtils() {
        throw new IllegalStateException("Utility class");
    }

    public static void printName(Tool tool) {
        System.out.println(tool.getName());
    }
}
