interface LightAction {
    void activate(int brightness);
}

public class SmartLightSystem {

    public static void main(String[] args) {

        // Motion trigger
        LightAction motionTrigger = (brightness) ->
            System.out.println("Motion detected → Lights ON at " + brightness + "% brightness");

        // Time-based trigger (night)
        LightAction nightTrigger = (brightness) ->
            System.out.println("Night time → Dim lights at " + brightness + "% brightness");

        // Voice command trigger
        LightAction voiceTrigger = (brightness) ->
            System.out.println("Voice command → Ambient lights at " + brightness + "% brightness");

        // Party mode
        LightAction partyMode = (brightness) ->
            System.out.println("Party mode  → RGB lights flashing at " + brightness + "% brightness");

        // Emergency mode
        LightAction emergencyMode = (brightness) ->
            System.out.println("Emergency  → Red lights blinking at " + brightness + "% brightness");

        // Execute all triggers
        motionTrigger.activate(100);
        nightTrigger.activate(30);
        voiceTrigger.activate(60);
        partyMode.activate(90);
        emergencyMode.activate(80);
    }
}
