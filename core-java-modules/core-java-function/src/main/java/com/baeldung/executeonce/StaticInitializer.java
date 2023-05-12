package com.baeldung.executeonce;

final class StaticInitializer {

    public static int CALL_COUNT = 0;

    static {
        initializationLogic();
    }

    private static void initializationLogic() {
        CALL_COUNT++;
    }
}